//N = número de linhas M = númeero de colunas

void main() {
    Scanner scanner = new Scanner(System.in);
    int N, M, i, j, cont = 0;
    int maiorSomaLinha = 0, maiorSomaColuna = 0, soma = 0, maiorResultado = 0;

    N = scanner.nextInt();
    M = scanner.nextInt();

    int[][] matriz = new int[N][M];

    for(i = 0; i < N; i++) {
        for(j = 0; j < M; j++)
            matriz[i][j] = scanner.nextInt();
    }

    for(i = 0; i < N; i++) {
        soma = 0;

        for(j = 0; j < M; j++)
            soma+=matriz[i][j];

        if(soma > maiorSomaLinha)
            maiorSomaLinha = soma;
    }

    for(j = 0; j < M; j++) {
        soma = 0;

        for(i = 0 ; i < N; i++)
            soma+=matriz[i][j];

        if(soma > maiorSomaColuna)
            maiorSomaColuna = soma;
    }

    if(maiorSomaLinha > maiorSomaColuna)
        maiorResultado = maiorSomaLinha;

    else
        maiorResultado = maiorSomaColuna;

    System.out.println(maiorResultado);
}