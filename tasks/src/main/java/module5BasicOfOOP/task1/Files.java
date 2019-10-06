package module5BasicOfOOP.task1;

import java.util.List;
import java.util.Set;

public class Files {

    public static void create(String name, String contents, Directory directory) {

        directory.getFiles().add(new File(name, contents));

    }

    public static boolean rename(File file, String nameNew) {

        if (file != null && nameNew != null) {

            file.setName(nameNew);
            return true;

        }

        return false;
    }

    public static boolean addContents(File file, String addedContent) {

        if (file != null && addedContent != null) {
            file.setContent("" + file.getContent() + " " + addedContent);
            return true;
        }
        return false;

    }

    public static void printContents(File file) {

        System.out.println(file.getContent());

    }

    public static boolean delete(Directory directory, File file) {

        if (directory != null && file != null) {
            return directory.getFiles().remove(file);
        } else {
            return false;
        }
    }

}
