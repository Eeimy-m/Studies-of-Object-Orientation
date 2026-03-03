package list02;
import java.util.Scanner;
import java.util.StringJoiner;

/*
    Faça um programa que construa dois vetores A e B de 5 posições, lendo e
    adicionando valores inteiros a esses vetores. Crie um terceiro vetor C,
    composto pela soma dos elementos de A e B. Por exemplo:

    C[0] = A[0] + B[0]
    C[1] = A[1] + B[1]

    Após isso, escreva o conteúdo do vetor C, separados por vírgula.
    Qualquer situação fora do domínio de entrada resulta em saída uma “Erro”.

    Exemplos de entrada e saída esperada:

    Entrada = 2 5 8 34 5               | Saída = 10, 56, 10, 50, 10
              8 51 2 16 5
    Entrada = -10 0 10 20 30           | Saída = 90, 50, 10, -30, -70
              100 50 0 -50 -100
*/

public class Ex02 {

    public static final int SIZEOF_VECTOR = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetA = new int[SIZEOF_VECTOR];
        int[] vetB = new int[SIZEOF_VECTOR];

        for(int i = 0; i < vetA.length; i++) {
            vetA[i] = scanner.nextInt();
        }

        for(int i = 0; i < vetB.length; i++) {
            vetB[i] = scanner.nextInt();
        }

        System.out.println(compute(vetA, vetB));
    }

    static String compute(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[SIZEOF_VECTOR];

        for(int i = 0; i < arrayC.length; i++) {
            if(sumOverflowsOrUnderflows(arrayA[i], arrayB[i]))
                return "Erro";

            arrayC[i] = arrayA[i] + arrayB[i];
        }

        final var joiner = new StringJoiner(", ");
        for(int value : arrayC)
            joiner.add(String.valueOf(value));

        return joiner.toString();
    }

    private static boolean sumOverflowsOrUnderflows(int a, int b) {
        return (long) a + b > Integer.MAX_VALUE ||
                (long) a + b < Integer.MIN_VALUE;
    }
}