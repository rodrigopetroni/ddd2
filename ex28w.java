package estrutura_repeti��o;
import java.util.Scanner;
public class ex28w {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, t;
		t = 100 * (100 + 1);
		num = t / 2;
		
		System.out.printf("Soma dos n�meros inteiros positivos do intervalo de um a cem.");
		
		while(num != 5050) {
			System.out.printf("Erro");
		}
		
		System.out.printf("\nA soma � de: %d", num);

	}

}

