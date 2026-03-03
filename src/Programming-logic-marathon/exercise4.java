void main() {
    Scanner scanner = new Scanner(System.in);
    int L, C, A, B, i, j;

    L = scanner.nextInt();
    C = scanner.nextInt();
    A = scanner.nextInt();
    B = scanner.nextInt();

    int[][] matrizSalao = new int[L][C];
    for(i = 0; i < L; i++) {
        for(j = 0; j < C; j++)
            matrizSalao[i][j] = scanner.nextInt();
    }
}

void percorrerMatriz(int a, int b, int l, int col, int[][] mat) {
    int i, j, cont = 0;


}