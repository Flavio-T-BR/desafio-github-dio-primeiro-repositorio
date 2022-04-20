import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double areatriangulo = a * c / 2;
		double areacirculo = 3.141519 * Math.pow(c, 2);
		double areatrapezio = (a + b) * c / 2;
		double areaquadrado = Math.pow(b, 2);
		double arearetangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", areatriangulo);
		System.out.printf("CIRCULO: %.3f%n", areacirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areatrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaquadrado);
		System.out.printf("RETANGULO: %.3f%n", arearetangulo);
		
		sc.close();
	}

}
