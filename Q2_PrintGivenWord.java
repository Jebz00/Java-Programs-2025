import java.util.Scanner;
public class Q2_PrintGivenWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();
            System.out.println(word);
        }
    }
}