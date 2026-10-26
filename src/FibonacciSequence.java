void main() {
    int terms = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms in the Fibonacci sequence: ");

    terms = sc.nextInt();

    int[] fibonacciSequence = new int[terms];

    for (int i = 0; i < terms; i++) {
        if (i == 0) {
            fibonacciSequence[i] = 1;
        }
        else if (i == 1) {
            fibonacciSequence[i] = 1;
        }
        else {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
    }

    for  (int i = 0; i < terms; i++) {
        System.out.println("Fibonacci term " + (i + 1) + ": " + fibonacciSequence[i]);
    }
}