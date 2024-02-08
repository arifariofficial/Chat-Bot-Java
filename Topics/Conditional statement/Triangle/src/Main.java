import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(canExist(A, B, C)? "YES": "NO");
    }

    public static boolean canExist(int A, int B, int C) {
        return (A + B > C) && (A + C > B) && (B + C > A);
    }
}