package tp1.ejercicio5;
/*
 * Dado un arreglo de valores tipo entero se desea calcular el valor máximo, mínimo, y promedio
en un único método. Escriba tres métodos de clase, donde respectivamente:
a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de
tipo arreglo).
c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".

 */
public class ejercicio5 {
    private static int maximo;
    private static int minimo;
    private static int promedio;
    private static int[] arreglo; 

    public static int[] conReturn(int[]arreglo){
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        int maximo = arreglo[0];
        int minimo = arreglo[0];
        int suma = 0;

        for (int i : arreglo) {
            if(i > maximo) maximo = i;
            if(i < minimo) minimo = i;
            suma += i;
        }
        int promedio = suma / arreglo.length;
        
        return new int[]{maximo, minimo, promedio};
    }

    public static void sinArreglo(int[]arreglo, stats s){
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }
        int maximo = arreglo[0];
        int minimo = arreglo[0];
        int suma = 0;
        for(int i : arreglo){
            if(i > maximo) maximo = i;
            if(i < minimo) minimo = i;
            suma += i;
        }
        s.setMaximo(maximo);
        s.setMinimo(minimo);
        s.setPromedio(suma/arreglo.length);
    }


    public static void sinArregloV2(stats s, int...arreglo){
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }        
        int maximo = arreglo[0];
        int minimo = arreglo[0];
        int suma = 0;
        for(int i : arreglo){
            if(i > maximo) maximo = i;
            if(i < minimo) minimo = i;
            suma += i;
        }
        s.setMaximo(maximo);
        s.setMinimo(minimo);
        s.setPromedio(suma/arreglo.length);
    }

    public static void sinParametrosSinReturn(){
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }        
        maximo = arreglo[0];
        minimo = arreglo[0];
        int suma = 0;
        for(int i : arreglo){
            if(i > maximo) maximo = i;
            if(i < minimo) minimo = i;
            suma += i;
        }
        promedio = suma / arreglo.length;
    }

    public static void mostrarResultados() {
        System.out.println("máximo: " + maximo);
        System.out.println("mínimo: " + minimo);
        System.out.println("promedio: " + promedio);
    }

    public static void mostrarResultados(int[] a) {
        System.out.println("máximo: " + a[0]);
        System.out.println("mínimo: " + a[1]);
        System.out.println("promedio: " + a[2]);
    }

    public static void main(String[] args) {
        arreglo = new int[]{5, 10, 3, 8, 12, 7};

        System.out.println("==== A ====");
        int[] a = conReturn(arreglo);
        mostrarResultados(a);
        System.out.println("==== B ====");
        stats s = new stats();
        stats s2 = new stats();
        sinArreglo(arreglo, s);
        sinArregloV2(s2, a);
        System.out.println(s);
        System.out.println(s2);
        System.out.println("==== C ====");
        sinParametrosSinReturn();
        mostrarResultados();
    }
}
