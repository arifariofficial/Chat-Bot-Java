import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double result = IntStream.rangeClosed(in.nextInt(), in.nextInt())
                .filter(value -> value % 3 == 0)
                .average()
                .orElse(0);

        System.out.println(result);
    }

}