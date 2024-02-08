import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows for the pyramid
        int n = scanner.nextInt();

        for (; n > 0; n--){
            for (int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}