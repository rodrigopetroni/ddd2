package estrutura_repeti��o;
import java.util.Scanner;
public class ex26d {


	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner (System.in)) {
					int num, t, i, i1, i2;
					
					do {
						System.out.printf("Digite um n�mero positivo: ");
						num = ler.nextInt();
					}
					while (num <= 0);
					
					System.out.printf("Digite o primeiro n�mero do intervalo da tabuada: ");
					i1 = ler.nextInt();
					
					do {
						System.out.printf("Digite o segundo n�mero do intervalo da tabuada: ");
						i2 = ler.nextInt();
					}
					while (i2 <= i1);
					
					i = i2;
					
					do {
						t = num * i;
						System.out.printf("\n%d X %d = %d", num, i, t);
						i--;
					}
					while (i >= i1);
				}
			}

		}

