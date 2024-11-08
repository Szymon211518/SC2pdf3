import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);
        System.out.println("waga");
        int BMI = klawiatura.nextInt();
        System.out.println("wzrost");
        double wzrost = klawiatura.nextDouble();

        double bmi;
        bmi = (double) BMI / Math.pow((double) wzrost, 2);
        if (bmi > 25) {
            System.out.println("przejdz na diete");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Jestes idealny");
        } else if (bmi < 18.5) {
            System.out.println("przytyj bo mało ważysz");
        }
    }
}
