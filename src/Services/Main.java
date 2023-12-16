package Services;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Select your choices: ");
            System.out.println("Press 1=Create File, " +
                    "Press 2=Read File," +
                    "Press 3=Update File," +
                    "Press 4=Delete " +
                    "Press 5=Exit ");

            Scanner scanner = new Scanner(System.in);
            int selectedChoice = scanner.nextInt();

            switch (selectedChoice) {
                case 1:
                    Createfile createfile = new Createfile();
                    try {
                        createfile.create();
                    } catch (IOException e) {
                        System.err.println("Error creating file: " + e.getMessage());
                    }
                    break;
                case 2:
                    Readfile readfile = new Readfile();
                    try {
                        readfile.read();
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                    }
                    break;
                case 3:
                    Updatefile updatefile = new Updatefile();
                    try {
                        updatefile.update();
                    } catch (IOException e) {
                        System.err.println("Error updating file: " + e.getMessage());
                    }
                    break;
                case 4:
                    Deletefile deletefile = new Deletefile();
                    try {
                        deletefile.delete();
                    } catch (IOException e) {
                        System.err.println("Error deleting file: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}