/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada	Saída
    10      6
    2
    5
 */

void main() {
    double N;
    int C, M;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira a seguir o valor em dinheiro levado pelo cliente, o valor de um chocolate e a quantidade de embalagens: ");
    N = scanner.nextDouble();
    C = scanner.nextInt();
    M = scanner.nextInt();

    if(N >= 0 && C >= 0 && M >= 0)
        calculoQuantChocolates(N, C, M);
    else
        System.out.println("Erro");
}

void calculoQuantChocolates(double N, int C, int M) {
    int quantTotalChoc, i;

    if(M % 5 == 0 && M >= 5)
        System.out.println(N/C + M/5);
    else if(M >= 5) {
        for(i = 1; (M - i)%5!= 0; i++) {
            M-=1;
        }
        System.out.println(N/C + M/5);
    }
}