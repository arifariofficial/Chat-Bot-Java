import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        // Calculate the count of numbers divisible by n from 1 to b
        int countUpToB = b / n;

        // Calculate the count of the numbers divisible by n from 1 to a-1
        int countUpToAminus1 = (a -1 ) / n;

        // The count of numbers divisible by n in the range a to b is the difference of above two counts
        int countInRange = countUpToB - countUpToAminus1;

        System.out.println(countInRange);
    }
}