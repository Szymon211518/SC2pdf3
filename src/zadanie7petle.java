import java.util.Scanner;
public class zadanie7petle {
    public static void main(String[] args) {
        for(int i = 1; i<7; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("wprowadz liczbe");
            int liczba = scanner.nextInt();
            int suma;
            suma = i++ + liczba;
            System.out.println(suma);
            }
        }
    }

