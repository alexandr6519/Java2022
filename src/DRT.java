import java.util.Scanner;

public class DRT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String str1 = "\"3\" + 56";
        System.out.println(str1 + System.lineSeparator() + str2);
        System.out.println("I want to return to JAVA again");
        double d1 = 1.00;
        System.out.println("Square is equal to: " + Math.PI * Math.pow(d1, 2));
        System.out.println("Perimeter is equal to: " + Math.PI * 2 * d1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.println("a - b = " + (a - b));
        System.out.print("Введите name: ");
        String str4 = scanner.nextLine();
        System.out.println("Привет " + str4 + "!");*/
        String str2 = "Sasha";

        String userLine = scanner.nextLine();
        if (str2.equals(userLine)) {
            System.out.print("Совпали слова!");
        } else {
            System.out.print("НЕ совпали слова!");
        }
    }
}
