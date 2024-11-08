import java.util.Scanner;
public class zadanie8petle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do{
            System.out.println("wprowadz liczbe");
            liczba = scanner.nextInt();
            liczba*=10;
        }
        while(liczba < 100);
        System.out.println("końcowa" + liczba);
        scanner.close();
    }
}
