import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        System.out.println();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (; a <= b; a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}