import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(canBreakChocolate(N,M,K)? "YES": "NO");

    }

    private static boolean canBreakChocolate(int N, int M, int K) {
        return (K % N == 0 && K / N <= M) || (K % M == 0 && K / M <= N);
    }
}