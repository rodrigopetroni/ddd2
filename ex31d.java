package estrutura_repeti��o;
import java.util.Scanner;
public class ex31d {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		int i = 0;
		int a = 1;
		int b = 0;
		int aux;
		
		do {
			System.out.printf("Digite at� qual casa voc� gostaria de saber da sequ�ncia: ");
			num = ler.nextInt();
		}while(num <= 0);

		i = 0;
		
		do {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
			i++;
		}while(i <= num);
		
	}

}

