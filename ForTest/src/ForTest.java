import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		if (numero >= 0) {
			for (int i = 0; i <= numero; i++) {
				System.out.println(i);

			}
		}
	}

}
