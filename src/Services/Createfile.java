package Services;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Createfile {
    public void create() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        Path path = Paths.get("D:\\PK\\Java", fileName);

        try {
            Files.createFile(path);
            System.out.println("File created successfully.");
        } catch (FileAlreadyExistsException ex) {
            System.err.println("File already exists");
        }
    }
}
