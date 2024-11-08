import java.util.Scanner;
public class zadanie4petle {

    public static void main(String[] args) {
        System.out.println("twoje imie tu wpisz ");
        Scanner scanner = new Scanner(System.in);
        String literka = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(literka);
        }
    }

}
