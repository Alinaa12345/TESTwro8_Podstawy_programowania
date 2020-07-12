import java.util.Scanner;

public class Scannner{
    public static void main(String[] args) {
        System.out.println("Witaj w programie");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciag znakow");
        String string = scanner.next();
        System.out.println("Podaj pozycje znaku");
        int index = scanner.nextInt();
        System.out.println("Ciag" + string + " zawiera" + string.charAt(index)+ " na pozycji" + index);

    }
}
