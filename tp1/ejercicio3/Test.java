package tp1.ejercicio3;

public class Test {
    public static void main(String[] args) {
        Estudiante[] est = new Estudiante[2];
        Profesor[] prof = new Profesor[3];

        Estudiante e1 = new Estudiante();
        e1.setNombre("Juan");
        e1.setApelido("Perez");
        e1.setComision("1A");
        e1.setDireccion("Calle Falsa 123");
        est[0] = e1;

        Estudiante e2 = new Estudiante();
        e2.setNombre("Pedro");
        e2.setApelido("Gomez");
        e2.setComision("2B");
        e2.setDireccion("Calle Falsa 456");
        est[1] = e2;

        Profesor p1 = new Profesor();
        p1.setNombre("Carlos");
        p1.setApellido("Gonzalez");
        p1.setEmail("car@gmail.com");
        p1.setCatedra("Algoritmos");
        p1.setFacultad("Ingenieria");
        prof[0] = p1;

        Profesor p2 = new Profesor();
        p2.setNombre("Ana");
        p2.setApellido("Lopez");
        p2.setEmail("ana@gmail.com");
        p2.setCatedra("Algoritmos");
        p2.setFacultad("Ingenieria");
        prof[1] = p2;

        Profesor p3 = new Profesor();
        p3.setNombre("Maria");
        p3.setApellido("Rodriguez");
        p3.setEmail("maria@gmail.com");
        p3.setCatedra("Algoritmos");
        p3.setFacultad("Ingenieria");
        prof[2] = p3;

        for (Profesor profesor : prof) {
            System.out.println(profesor.tusDatos());
            System.out.println(" ");
        }
        
        System.out.println("=========================");

        for(Estudiante estudiante: est){
            System.out.println(estudiante.tusDatos());
            System.out.println(" ");
        }
    }
}
