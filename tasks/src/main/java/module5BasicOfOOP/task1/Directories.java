package module5BasicOfOOP.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 * Утилитный класс, который  распознает  дерево директориев и файлов из файла source.txt
 */


public class Directories {

    private Directories() {
    }

    static Path pathSource = Paths.get("E:\\java\\projects\\IntroductionToJava\\tasks\\src\\main\\java",
            "module5BasicOfOOP\\task1\\source");


    public static Directory getDirectory() {

        Directory directory = new Directory("Main");


        try (BufferedReader bufferedReader = Files.newBufferedReader(pathSource)) {

            String s;
            boolean isNewDirectory = false;

            while ((s = bufferedReader.readLine()) != null) {

                Directory promDirectory = directory;

                int indexContents = s.indexOf(" ");

                String[] sSplit = s.substring(0, indexContents).split("/");

                int position;

                for (int i = 0; i < sSplit.length ; i++) {

                    if (sSplit[i].contains(".") ) {

                        promDirectory.addFile(new File(sSplit[i], s.substring(indexContents+1)));

                    } else if ((position = hasInList(promDirectory.getDirectories(), sSplit[i])) != -1) {

                        promDirectory = promDirectory.getDirectories().get(position);

                    } else {


                        promDirectory.addDirectory(new Directory(sSplit[i]));
                        promDirectory = promDirectory.getDirectories().get(promDirectory.getDirectories().size() - 1);

                    }


                }

            }


        } catch (IOException e) {
            System.out.println("ERROR opening of file");
        }

        return directory;
    }


    /**
     * Поиск позиции в списке Directories, если же в списке такого directory не имеется, то возвращается -1
     **/
    private static int hasInList(List<Directory> directoryList, String inner) {

        for (int i = 0; i < directoryList.size(); i++) {

            if (directoryList.get(i).getName().equals(inner)) {

                return i;
            }
        }
        return -1;

    }

}
