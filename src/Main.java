import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, X = 0, Y = 0, soma = 0;
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			Y = sc.nextInt();
			
				if (X % 2 == 1) {
					soma = X * Y + Y * (Y - 1); 
				}else {
					soma = X * Y + Y * Y;
				}
			
			System.out.println(soma);
		}

		sc.close();

	}

}
