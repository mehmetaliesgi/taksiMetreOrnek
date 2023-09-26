import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, startPrice = 10;
        double  perKm = 2.2, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen gideceğiniz kilometre değerini giriniz: ");
        km = input.nextInt();

        total = km * perKm + startPrice;
        Double result = (total > 20) ? total : 20.0;

        System.out.println(result);
    }
}