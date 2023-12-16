package Services;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Updatefile {
    public void update()  throws IOException {

        Path myPath = Paths.get("D:\\PK\\Java\\Sourabh.txt");

        List<String> lines = new ArrayList<>();
        lines.add("Java is high level programming language!!");


        Files.write(myPath, lines, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE);

        System.out.println("Data written to a file");
    }
}
