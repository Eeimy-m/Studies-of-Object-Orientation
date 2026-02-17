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

void calcularValorDaMulta(double diferenca, double valMulta, double adPorKim) {
    double valorFinal = valMulta + adPorKim * diferenca;
    System.out.println(valorFinal);
}

void main() {
    Scanner scanner = new Scanner(System.in);
    double velocidadeLimite, valorMulta, adicionalPorKm, velocidadeVeiculo, diferenca;
    System.out.println("Informe a velocidade limite: ");
    velocidadeLimite = scanner.nextDouble();
    System.out.println("Informe o valor da multa: ");
    valorMulta = scanner.nextDouble();
    System.out.println("Informe o valor adicional: ");
    adicionalPorKm = scanner.nextDouble();
    System.out.println("Informe a velocidade do veículo: ");
    velocidadeVeiculo = scanner.nextDouble();

    diferenca = velocidadeVeiculo - velocidadeLimite;
    if(diferenca > 0)
        calcularValorDaMulta(diferenca, valorMulta, adicionalPorKm);
    else
        System.out.println("0.00");
}