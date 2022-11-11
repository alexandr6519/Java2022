import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class ReadFileArray {
    private static double [] sortingByChoice (double [] a){
        for (int i = 0; i < a.length; i++) {
            double min = a [i];
            int indexMin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (min > a [j]) {
                    min = a [j];
                    indexMin = j;
                }
            }
            a [indexMin] = a [i];
            a [i] = min;
        }
        return a;
    }
    private static double [] sortingByBubble (double [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    double max = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = max;
                }
            }
        }
        return a;
    }

            public static void main(String[] args) throws FileNotFoundException {
            try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\untitled\\src\\TEXT\\TestArray.txt"))) {

                int count = scanner.nextInt();
                double[] a = new double[count];

                for (int i = 0; i < count; ++i) {
                    a[i] = scanner.nextDouble();
                }

                System.out.println(Arrays.toString(sortingByBubble(a)));
                System.out.println(Arrays.toString(sortingByChoice(a)));
            /*for(String e: array){
                if (e != null)
                System.out.println(e);
            }

             for (int i = 0; i < count; ++i) {
                array[i] = scanner.nextLine();
                System.out.println(array[i] + " ");

            }*/
            }
        }
    }


