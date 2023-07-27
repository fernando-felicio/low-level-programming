package bitwise;
import java.util.Scanner;

public class testBitwise {
	public static void main (String[] args) {
		
		//Exemplos práticos de cada operador "&, | e ^"
		int n1 = 89;
		int n2 = 60;
		
		//Dados de saída referente à cada operador
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		//Recebendo input do usuario:
		System.out.println("Enter the number here: ");
		
		//Declarando variavel do input
		int numBit = sc.nextInt();
		
		//Declarando mascara de comparação do número binário:
		int numMask = 0b00100000;
		
		//Criando regras de negócio
		
		if ((numBit & numMask) != 0) {
			System.out.println("The 6th bit is true");
		}else {
			System.out.println("The 6th bit is false");
		}
		
		
	}
	
}