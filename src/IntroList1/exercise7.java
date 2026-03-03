    /*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total
    com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada    	Saída
    100         75.00
    1.50
    1.25
    50
    Entrada    	Saída
    100         187.50
    1.50
    1.25
    150
*/

void main() {
    double V1, V2, quantkm;
    int X;
    Scanner scanner = new Scanner(System.in);

    X = scanner.nextInt();
    V1 = scanner.nextDouble();
    V2 = scanner.nextDouble();
    quantkm = scanner.nextDouble();

    System.out.println(calcFinalValue(X, V1, V2, quantkm));
}

double calcFinalValue(int x, double v1, double v2, double a) {
    double output = -0.1;

    if(a <= x)
        output = v1 * a;
    else
        output = v2 * a;

    return output;
}