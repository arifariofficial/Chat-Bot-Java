import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int countD = 0, countC = 0, countB = 0, countA = 0;

        for (int i = 0; i <= n; i++){
            String grade = scanner.nextLine();
            switch (grade){
                case "D":
                    countD++;
                    break;
                case "C":
                    countC++;
                    break;
                case "B":
                    countB++;
                    break;
                case "A":
                    countA++;
                    break;
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);

    }
}