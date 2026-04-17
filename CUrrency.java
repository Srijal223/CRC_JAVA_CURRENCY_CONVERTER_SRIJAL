import java.util.Scanner;

public class CUrrency{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Choose the conversions:");
            System.out.println("1.INR TO USD");
            System.out.println("2.USD TO INR");
            System.out.println("3.INR TO EUR");
            System.out.println("4.EUR TO INR");
            System.out.println("5.USD TO EUR");
            System.out.println("6.EUR TO USD");
            System.out.println("0.EXIT");

            int choice = sc.nextInt();



            switch (choice) {

                case 1:
                    System.out.println("ENTER INR");
                    double inr = sc.nextDouble();
                    double usd = 0.011 * inr;
                    System.out.println("USD: " + usd);
                    break;

                case 2:
                    System.out.println("ENTER USD");
                    double usd1 = sc.nextDouble();
                    double inr1 = 92.88 * usd1;
                    System.out.println("INR: " + inr1);
                    break;

                case 3:
                    System.out.println("ENTER INR");
                    double inr3 = sc.nextDouble();
                    double eur = 0.0091 * inr3;
                    System.out.println("EUR: " + eur);
                    break;

                case 4:
                    System.out.println("ENTER EUR");
                    double eur1 = sc.nextDouble();
                    double inr4 = 109.49 * eur1;
                    System.out.println("INR: " + inr4);
                    break;

                case 5:
                    System.out.println("ENTER USD");
                    double usd2 = sc.nextDouble();
                    double eur4 = 0.85 * usd2;
                    System.out.println("EUR: " + eur4);
                    break;

                case 6:
                    System.out.println("ENTER EUR");
                    double eur3 = sc.nextDouble();
                    double usd4 = 0.85 * eur3;
                    System.out.println("USD: " + usd4);
                    break;

                default:
                    System.out.println("INVALID CHOICE");
            }
        }


    }
}