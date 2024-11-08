import java.util.Scanner;

public class zadanie1petle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int liczba;
    do{
        System.out.print("Liczby z przedziału od 10 do 24");
        liczba = scanner.nextInt();
    }while(liczba < 10 || liczba>24);
    System.out.println("Liczba to ");
    scanner.close();
    }
}
