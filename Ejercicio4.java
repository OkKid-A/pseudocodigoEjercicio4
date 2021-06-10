import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa la muestra");
		int menor = scanner.nextInt();
		int mayor = menor;
		for (int i = 0;i < 19;i++) {
			System.out.println("Ingresa la muestra");
			int N = scanner.nextInt();
			if (N < menor) {
				menor = N;
			} else if (N > mayor){
				mayor = N;
			}
		}
		System.out.println("\nLa edad mayor es " + mayor + " y la menor es " + menor);
	}
}