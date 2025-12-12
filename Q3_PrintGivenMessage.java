import java.util.Scanner;
public class Q3_PrintGivenMessage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String message = sc.nextLine();
            System.out.println(message);
        }
    }
}