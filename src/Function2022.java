import java.util.Locale;
import java.util.Scanner;

public class Function2022 {

     private static double countOrder(double x, double y){
        double p1 = 50;
        double p2 = 80;
        double discount;
        double sumOrder = x * p1 + y * p2;

        if ((x + y >= 10) || ( sumOrder >= 1000)){
            discount = 0.05;
        } else {
            return sumOrder;
        }
        if ((x + y >= 10) && ( sumOrder >= 1000)){
           return sumOrder * 0.9;
        }
        return sumOrder * (1 - discount);
    }

    private static double f1(double x, double y){
        return (Math.pow(x, 2) + Math.pow(y, 2));
    }

    private static void compareNumbers(double x, double y){
        double epsilon = 1.0e-5;
        if (Math.abs(x - y) < epsilon) {
            System.out.println("Numbers are equals");
             return;
        }
        if (x - y > epsilon) {
            System.out.println("First number is more than second");
        } else {
            System.out.println("First number is less than second");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Введите число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        //System.out.println("сумма квадратов введенных  чисел равна: " + f1(a, b));
       // compareNumbers(a, b);
        System.out.printf("количество заказа равно: %.0f штук, а сумма заказа равна: %.2f рублей", (a + b), countOrder(a, b));
    }
}
