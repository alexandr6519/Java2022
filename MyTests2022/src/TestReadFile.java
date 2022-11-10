import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\untitled\\src\\TEXT\\Test122.txt"))) {
            StringBuilder sb = new StringBuilder();

            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
                sb.append(System.lineSeparator());
            }

            System.out.println(sb.toString());
        }
    }
}
