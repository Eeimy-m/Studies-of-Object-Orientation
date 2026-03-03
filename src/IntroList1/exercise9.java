import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/

void main(String[] args) {
    //System.out.println(ex09.compute(somaIdades, maioresDeIdade, idosos, cont));
}

String compute(String string) {
    Scanner scanner = new Scanner(System.in);
    double porcentagem, media;
    int cont = 0, idosos = 0, somaIdades = 0, maioresDeIdade = 0, i, idade = 1;
    String output = null;

    while(idade >= 0) {
        idade = scanner.nextInt();

        if(idade >= 0) {
            somaIdades+=idade;

            if(idade >= 18)
                maioresDeIdade++;
            if(idade > 75)
                idosos++;

            cont++;
        }
    }

    porcentagem = (idosos/cont)*100;
    media = (double) somaIdades/cont;

    output = String.format(Locale.US, "%.2f %d %.2f%%", media, maioresDeIdade, porcentagem);
    System.out.println(output);

    return output;
}
