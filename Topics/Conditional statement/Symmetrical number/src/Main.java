import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        String numberStr = Integer.toString(number);  //Convert int to String

        if ((numberStr.charAt(0) == numberStr.charAt(3) && numberStr.charAt(1) == numberStr.charAt(2))) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}