import java.util.Scanner;
public class WordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String word = sc.nextLine().trim();
            if (!word.isEmpty()) {
                System.out.println(word.length());
            }
        }
        sc.close();
    }
}
