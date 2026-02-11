/*
    Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

    Escaleno (todos os lados diferentes)
    Isósceles (possui dois lados iguais)
    Equilátero (todos os lados iguais)
    Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
    Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
    Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

void main() {
    double a, b, c;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira a seguir respectivamente o tamanho dos lados de um triângulo: ");
    a = scanner.nextDouble();
    b = scanner.nextDouble();
    c = scanner.nextDouble();

    if(a > 0 && b > 0 && c > 0) {
        if(a == b && b == c)
            System.out.println("Equilátero");
        else if(a == b || b == c || a == c)
            System.out.println("Isósceles");
        else if(a + b < c || b + c < a || a + c < b)
            System.out.println("Não forma triângulo");
        else
            System.out.println("Escaleno");
    }
    else
        System.out.println("Erro");

}