package bitwise;

import java.util.Scanner;

public class testBitwise {
    public static void main(String[] args) {
        // Exemplos práticos de cada operador "&, | e ^"
        int n1 = 89;
        int n2 = 60;

        // Dados de saída referente a cada operador
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        // Recebendo input do usuário:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");

        // Declarando variável para o input
        int numBit = sc.nextInt();

        // Declarando máscara de comparação do número binário:
        final int NUM_MASK = 0b00100000;

        // Criando regras de negócio
        if ((numBit & NUM_MASK) != 0) {
            System.out.println("The 6th bit is true");
        } else {
            System.out.println("The 6th bit is false");
        }

        // Fechando o scanner
        sc.close();
    }
}
