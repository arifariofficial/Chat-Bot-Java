import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfElements = scanner.nextInt();
        int sumOfDivisibleBy6 = 0;

        for( int i = 0; i < numOfElements; i++){
            int element = scanner.nextInt();
            if (element % 6 == 0){
                sumOfDivisibleBy6 += element;
            }
        }
        System.out.println(sumOfDivisibleBy6);
    }
}