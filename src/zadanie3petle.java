import java.util.Scanner;
public class zadanie3petle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String literka;
        do{
            System.out.println("wpisz tak lub nie");
            literka =scanner.nextLine();
        }while (literka.equalsIgnoreCase("tak") && literka.equalsIgnoreCase("nie"));
        System.out.println("tekst is good ");
        scanner.close();
    }
}
