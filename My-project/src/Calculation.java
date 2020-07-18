import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        short b = (short) a;
        int c = a - b;

        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        String cString = String.valueOf(c);

        char target;
        String message = "Wynik %a - %b = %c"
                .replace(target:"%a", aString);
    }
}
