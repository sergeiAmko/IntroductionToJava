package module6Tasks.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadWriteFiles {

    private Path path;

    public ReadWriteFiles(String nameFile) {
        this.path = Path.of("E:\\java\\projects\\IntroductionToJava\\tasks\\src\\main\\java\\module6Tasks\\task1", nameFile);

    }

    public List<String> read() throws IOException {

        return Files.readAllLines(path);

    }

    public void write(List<String> lines) throws IOException {

        Files.write(path, lines);

    }
}
