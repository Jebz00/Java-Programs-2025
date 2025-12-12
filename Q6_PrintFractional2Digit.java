import java.util.Scanner;
public class Q6_PrintFractional2Digit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double num = sc.nextDouble();
            System.out.printf("%.2f", num);
        }
    }
}