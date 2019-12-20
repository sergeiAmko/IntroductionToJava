package module6Tasks.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IO {

    private static Path path = Path.of("E:\\java\\projects\\IntroductionToJava\\tasks\\src\\main\\java\\module6Tasks\\task2\\notes.txt");


    public static List<String> read() throws IOException {

        return Files.readAllLines(path);

    }

    public static void write(List<String> strings) throws IOException {

        Files.write(path, strings);

    }


}
