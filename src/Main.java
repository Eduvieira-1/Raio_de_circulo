import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in)
				;
		double R, a, pi = 3.14159;
		
		System.out.println("Informe o raio: ");
		R = sc.nextDouble(); 
		
		a = pi * R * R;
		
		
		System.out.printf("O raio é: %.4f%n", a);
		
		sc.close();
	}

}
