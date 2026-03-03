/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50

    L = limite de velocidade
    M = valor fixo
    A = valor a cada km a cima de L
    V = velocidade
*/

void main() {
    Scanner scanner = new Scanner(System.in);
    int L, V;
    double M, A, diferenca;

    L = scanner.nextInt();
    M = scanner.nextDouble();
    A = scanner.nextDouble();
    V = scanner.nextInt();

    diferenca = V - L;
    if(diferenca > 0)
        System.out.println(calcularValorDaMulta(diferenca, M, A));
    else
        System.out.println("0.00");
}

String calcularValorDaMulta(double diferenca, double m, double a) {
    String output =  null;

    if(diferenca > 0) {
        output = String.format(Locale.US, "%.2f", m + a * diferenca);
    }
    else
        output = "0.00";

    return output;
}