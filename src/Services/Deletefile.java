package Services;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Deletefile {
    public void delete() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        Path myPath = Paths.get("D:\\PK\\Java", fileName);

        try {
            boolean fileDeleted = Files.deleteIfExists(myPath);

            if (fileDeleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.err.println("Error deleting the file: " + e.getMessage());
        }
    }
}
