package estrutura_repeti��o;
import java.util.Scanner;
public class ex28f {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int num, t, i;
		
		System.out.printf("Digite um n�mero positivo para ser o m�ximo: ");
		num = ler.nextInt();
		
		while (num <= 0) {
			System.out.printf("Erro, n�mero negativo! Digite um n�mero positivo: ");
			num = ler.nextInt();
		}
	       
        for (i=1; i<=100; i++) {
        	t = num * (num + 1);
			i = t / 2;
            System.out.printf("A soma dos n�meros inteiros positivos do intervalo de um a %d � igual a %d", num, i);
        } 

	}

}

