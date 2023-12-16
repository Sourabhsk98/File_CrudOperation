package Services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Readfile {
    public void read() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        Path myPath = Paths.get("D:\\PK\\Java", fileName);

        try {
            List<String> lines = Files.readAllLines(myPath, StandardCharsets.UTF_8);

            System.out.println("Empty File");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
