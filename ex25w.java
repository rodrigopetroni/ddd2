package estrutura_repeti��o;
import java.util.Scanner;
public class ex25w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, t, i;
		
		System.out.printf("Digite um n�mero positivo: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.printf("Digite um n�mero positivo: ");
			num = ler.nextInt();
		}
		
		i = 1;
		
		while(i <= 10) {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, t, i);
			i++;
		}
	}

}

