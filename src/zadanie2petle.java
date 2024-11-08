import java.util.Scanner;
public class zadanie2petle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String literka;
        do{
            System.out.println("wpisz litere t, T, n, N ");
            literka = scanner.nextLine();
        }while(!literka.equalsIgnoreCase("t") && !literka.equalsIgnoreCase("T")
                && !literka.equalsIgnoreCase("n") && !literka.equalsIgnoreCase("N"));
        System.out.println("Litera jest poprawna ");
        scanner.close();
    }
}
