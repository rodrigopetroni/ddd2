package estrutura_repeti��o;
import java.util.Scanner;
public class ex25d {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, t, i;
		
		do {
			System.out.printf("Digite um n�mero positivo: ");
			num = ler.nextInt();
		}while(num <= 0);
		
		i = 1;
		
		do {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
			i++;
		}while(i <= 10);

	}

}

