/*
    Alan quer comprar limões para fazer uma limonada. Próximo da sua casa há um mercadinho que vende limões da seguinte
    forma: O primeiro limão é vendido por C centavos, o segundo por C − 1 centavos, o terceiro por C − 2 e assim
    por diante até o menor valor de 1 centavo. Por exemplo, se C = 3 e Alan quiser comprar *5* limões, o preço total
    será 3 + 2 + 1 + 1 + 1 = 8.

    Faça um programa que leia dois inteiros *N* e *C* que indicam respectivamente o número de limões e o valor em
    centavos do primeiro limão. Em seguida imprima o valor total em centavos.

    ### Exemplos de entrada e saída:

    | Entrada  | Saída  |
    | -------  | ------ |
    | 5 3      | 8      |
    | 3 3      | 6      |

    Fonte: Adaptado de https://neps.academy/problem/193
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
*/

void main() {
    int quantLimoes, C;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input the quantity of lemons the client wants: ");
    quantLimoes = scanner.nextInt();
    System.out.println("Input the value of the first lemon in cents: ");
    C = scanner.nextInt();

    if(C <= 0 || quantLimoes <= 0)
        System.out.println("Erro");
    else if(C == 1)
        System.out.println(C * quantLimoes);
    else
        calcFinalValue(quantLimoes, C);
}

void calcFinalValue(int quant, int C) {
    int i, finalVal = 0;
    for(i = quant; i > 0; i--) {
        if(C > 1) {
            finalVal+=C;
            C--;
        }
        else
            finalVal+=C;
    }

    System.out.println(finalVal);
}