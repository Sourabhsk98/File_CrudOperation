package Services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Updatefile {

    public void update() throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Get the file path from the user
        
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        Path myPath = Paths.get(filePath);

        // Read the existing content of the file
        
        List<String> lines = Files.readAllLines(myPath, StandardCharsets.UTF_8);

        // Display the existing content to the user
        
        System.out.println("Current content of the file:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Get the line number to edit
        
        System.out.print("Enter the line number to edit: ");
        int lineNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Get the new content from the user
        
        System.out.print("Enter the new content: ");
        String newContent = scanner.nextLine();

        // Update the specified line with the new content
        
        if (lineNumber >= 1 && lineNumber <= lines.size()) {
            lines.set(lineNumber - 1, newContent);
        } else {
            System.out.println("Invalid line number. No changes made.");
            return;
        }

        // Write the updated content back to the file
        
        Files.write(myPath, lines, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        System.out.println("File content updated successfully.");
    }
}
