package tp1.ejercicio1;

public class ejercicio1 {
    public static void con_for (int a,int b) {
		for (int i = a; i<=b;i++) {
			System.out.println(i);
		}
	}
	
	public static void con_while (int a,int b) {
		int i=a;
		while(i <=b) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void con_nada (int a,int b) {
		int i=a;
		if(i<=b) {
			System.out.println(i);
			con_nada(i+1, b);
		}
	}
    
    public static void main(String[] args) {
        con_for(1,7);
		System.out.println("=====================");
        con_while(0,4);
        System.out.println("=====================");
        con_nada(13,20);
    }
}