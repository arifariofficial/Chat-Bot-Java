import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int perfect = 0, teBeFixed = 0, rejected = 0;

        for (int i = 0; i < n; i++){
            int detectorPrint = scanner.nextInt();
            switch (detectorPrint){
                case 1:
                    teBeFixed++;
                    break;
                case -1:
                    rejected++;
                    break;
                case 0:
                    perfect++;
                    break;
            }
        }
        System.out.println(perfect + " " + teBeFixed + " " + rejected);
    }
}