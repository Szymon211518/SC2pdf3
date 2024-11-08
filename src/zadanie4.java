import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {


        Scanner skaner =new Scanner(System.in);
        System.out.println("Wprowadz trzy wyniki testu");
        int ocena1 = skaner.nextInt();
        int ocena2 = skaner.nextInt();
        int ocena3 = skaner.nextInt();
        double srednia;
        srednia = (ocena1 + ocena2 + ocena3)/3;
        System.out.println("wynik pierwszego testu to " + ocena1);
        System.out.println("wynik drugiego testu to " + ocena2);
        System.out.println("wynik trzeciego testu to " + ocena3);
        System.out.println("średnia testow to " + srednia);
        if (srednia <=100 && srednia>=90) {
            System.out.println("ocena 5: ");
        }
        else if(srednia <=89 && srednia>=80){
            System.out.println("ocena 4: ");
        }
        else if(srednia <=79 && srednia>=70){
            System.out.println("ocena 3: ");
        }
        else if(srednia <=69 && srednia>=60){
            System.out.println("ocena 2: ");
        }
        else if(srednia >60){
            System.out.println("ocena 1");
        }
}
}

