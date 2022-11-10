import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\untitled\\src\\TEXT\\Test122.txt"))) {
            StringBuilder sb = new StringBuilder("");
            //sb = "";
            String line = "";
            //String[] array = new String[80];
            //int i = 0;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                sb.append(line);
                sb.append(System.lineSeparator());

                //array[i++] = scanner.nextLine();

            }
            //String srt = sb.toString();
            System.out.println(sb.toString());
            /*for(String e: array){
                if (e != null)
                System.out.println(e);
            }
            System.out.println(Arrays.toString(array));
             for (int i = 0; i < count; ++i) {
                array[i] = scanner.nextLine();
                System.out.println(array[i] + " ");

            }*/
        }
    }
}
