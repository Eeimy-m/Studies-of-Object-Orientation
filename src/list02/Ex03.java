package list02;
import java.util.Scanner;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */

public class Ex03 {

    public static final int SIZEOF_FIRSTINTS = 10;
    public static final int SIZEOF_LASTINTS = 20;

    public static void main(String[] args) {
        int[] numbers = new int[SIZEOF_FIRSTINTS];
        int[] otherInts = new int[SIZEOF_LASTINTS];
        int number, i, j, cont = 0;
        final Scanner scanner = new Scanner(System.in);

        for(i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        final Ex03 ex03 = new Ex03();
        while(numbers.length != 10)
            System.out.println(ex03.compute(numbers, otherInts));
    }

    String compute(int[] firstFive, int[] otherInts) {
        String output = null;
        Scanner scanner = new Scanner(System.in);
        int i, j, k, cont = 0, pos = -1;

        while(cont != 5) {
            otherInts[cont] = scanner.nextInt();

            for(j = 0; j < 5 || pos != -1; j++) {
                if(otherInts[cont] != firstFive[j]) {
                    firstFive[5 + cont] = otherInts[cont];
                    cont++;
                }
                else
                    pos = j;
            }

            if(pos != -1) {
                for(k = pos; k < 5 + cont; k++)
                    firstFive[k] = firstFive[k+1];
            }
        }

        return output;
    }
}