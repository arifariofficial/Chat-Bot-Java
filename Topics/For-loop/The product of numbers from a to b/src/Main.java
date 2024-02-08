import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //Initialize the product to 1 (since 1 is the multiplicative identity)
        long product = 1;

        for (int i = a; i < b; i++){
            product *= i;
        }

        System.out.println(product);
    }
}