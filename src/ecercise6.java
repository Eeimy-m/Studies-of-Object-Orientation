/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/

void main() {
    Scanner scanner = new Scanner(System.in);
    double L, A, C, M;
    System.out.println("Informe a largura da parede: ");
    L = scanner.nextDouble();
    System.out.println("Informe a altura da parede: ");
    A = scanner.nextDouble();
    System.out.println("Informe o valor de uma lata de tinta: ");
    C = scanner.nextDouble();
    System.out.println("Informe o rendimento dessa lata de tinta: ");
    M = scanner.nextDouble();

    if(L * A <= M) {
        System.out.println(1);
        System.out.println(C);
    }
    else
        calcQuantLatas(M, L * A, C);
}

void calcQuantLatas(double rendimento, double area, double valor) {
    int i, quantLatas = 0;
    for(i = 0; area > 0; i++) {
        area-=rendimento;
        quantLatas++;
    }

    System.out.println(quantLatas);
    System.out.println(valor * quantLatas);
}
