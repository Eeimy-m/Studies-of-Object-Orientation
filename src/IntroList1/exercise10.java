void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int x1, x2, v1, v2;

    x1 = scanner.nextInt();
    v1 = scanner.nextInt();
    x2 = scanner.nextInt();
    v2 = scanner.nextInt();

    System.out.println(results(x1, v1, x2, v2));
}

String results(int x1, int v1, int x2, int v2) {
    String output = null;

    if(v1 == v2)
        output = "NAO";
    else if((x2-x1)/(v1-v2) >= 0 && (x2-x1)%(v1-v2) == 0)
        output = "SIM";
    else
        output = "NAO";

    return output;
}