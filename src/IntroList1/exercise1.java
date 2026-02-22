/*
    Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode escolher entre dois planos de pagamento:

    Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    Critério B: R$ 0,50 por livro + R$ 2,50 fixo
    Faça um programa em que o usuário informe a quantidade positiva e não nula de livros seja impress qual o melhor plano de pagamento.

    Exemplo 1: Entrada = 100 | Saída = Criterio A
    Exemplo 2: Entrada = 5 | Saída = Criterio B
    Exemplo 3: Entrada = 20 | Saída = Indiferente
    Exemplo 4: Entrada = -5 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

void compararValores(double valorA, double valorB) {
    if(valorA == valorB)
        System.out.println("Indiferente.");
    else if(valorA < valorB)
        System.out.println("Criterio A");
    else if (valorA > valorB)
        System.out.println("Criterio B");
}

double calcularCriterioB(int quant) {
    double valorFinal = quant * 0.5 + 2.50;
    return  valorFinal;
}

double calcularCriterioA(int quant) {
    double valorFinal = quant * 0.25 + 7.50;
    return  valorFinal;
}

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira a seguir a quantidade de livros: ");
    int quantLivros = scanner.nextInt(); //pede p. o usuário inserir a quantidade de livros
    double valorCriterioA, valorCriterioB;

    if(quantLivros > 0) {
        valorCriterioA = calcularCriterioA(quantLivros);
        valorCriterioB = calcularCriterioB(quantLivros);
        compararValores(valorCriterioA, valorCriterioB);
    }
    else
        System.out.println("Erro");
}