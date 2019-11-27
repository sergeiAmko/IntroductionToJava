package module5BasicOfOOP.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<Directory> directories = new ArrayList<>();
    private List<File> files = new ArrayList<>();


    public void addDirectory(Directory directory) {
        if (!directories.contains(directory)) {

            directories.add(directory);

        } else {
            throw new IllegalArgumentException("Directory already exists");
        }
    }

    public void addFile(File file) {
        if (!files.contains(file)) {

            files.add(file);

        } else {
            throw new IllegalArgumentException("File already exists");
        }
    }


    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        if (files!=null){
            this.files = files;
        }
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", directories=" + directories +
                ", files=" + files + "\n";
    }
}
