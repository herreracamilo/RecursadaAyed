package tp1.ejercicio2;
import java.util.Scanner;
public class ejercicio2 {
    
    public static void f(int n){
        int[] arreglo = new  int[n];

        for(int i=1; i<=n; i++){
            arreglo[i-1]= i*n;
        }

        for (int i : arreglo) {
            System.out.print("{"+i+"}"+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n = sc.nextInt();
        while (n != 11) {
            f(n);
            System.out.println("Ingrese un numero entero: ");
            n = sc.nextInt();
        }
        sc.close();
    }

}
