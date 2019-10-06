package module5BasicOfOOP.task1;

import java.util.Scanner;


/**
 * Создать объект класса Текстовый файл, используя классы Файл и Директория. Методы: создать,
 * переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Main {

    public static void main(String[] args) {


        int choice;
        File file;
        Directory innerDirectory;

        Directory directory = Directories.getDirectory();


        String infoMenu = "\nInput the number:\n" +
                "1-create the file on directory\n" +
                "2-rename the file\n" +
                "3-print of the content of the file\n" +
                "4-add content of the file\n" +
                "5-delete the file\n" +
                "other- exit";


        while (true) {

            choice = getIntValue(infoMenu);
            System.err.println("You choice- "+choice);
            switch (choice) {
                case 1:

                    innerDirectory = choiceDirectory(directory, "Choice the directory");
                    String name = getStringValue("Input name of the file");
                    String content = getStringValue("Input content of the file");
                    Files.create(name, content, innerDirectory);


                    break;

                case 2:
                    Files.rename(choiceFile(directory, "Choice the file"), getStringValue("Input new name of the file"));
                    break;

                case 3:
                    Files.printContents(choiceFile(directory, "Choice the file"));
                    break;

                case 4:
                    Files.addContents(choiceFile(directory, "Choice the file"), getStringLine("Input added content of the file"));
                    break;

                case 5:

                    innerDirectory=choiceDirectory(directory, "Choice the directory");
                    file=choiceFile(innerDirectory, "Choice the file");
                    System.out.println("removal- "+Files.delete(innerDirectory,file));
                    break;

                case 6:
                    choiceFile(directory, "a");
                    break;
                default:

                    System.exit(0);
                    break;


            }
        }


    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while (true) {
            int a;
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                return a;
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static int getIntValueWithLimit(String message, int startLimit, int endLimitInclude) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(startLimit + " >= " + message + " <= " + endLimitInclude);
            int a;
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a >= startLimit && a <= endLimitInclude) {
                    return a;
                }
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static String getStringValue(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        while (true) {
            if (scanner.hasNext("\\D+")) {
                return scanner.next("\\D+");
            } else {
                System.out.println("You have entered an invalid string, input string only letters");
                scanner.next();
            }
        }
    }

    private static String getStringLine(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("You have entered an invalid string, input string only letters");
                scanner.next();
            }
        }
    }

    private static File choiceFile(Directory directory, String message) {
        int choice;
        Directory middleDirectory = directory;

        System.out.println(message);

        while (true) {

            int pos = 1;

            for (Directory innerDirectory : middleDirectory.getDirectories()) {
                System.out.println(pos++ + "- " + innerDirectory.getName());
            }

            for (File innerFile : middleDirectory.getFiles()) {
                System.out.println(pos++ + "- " + innerFile.getName());
            }
            pos--;

            choice = getIntValueWithLimit("Input the number", 1, pos);

            if (choice <= middleDirectory.getDirectories().size()) {
                middleDirectory = middleDirectory.getDirectories().get(choice - 1);
            } else {
                return middleDirectory.getFiles().get(choice - middleDirectory.getDirectories().size() - 1);
            }


        }


    }

    private static Directory choiceDirectory(Directory directory, String message) {
        int choice;
        Directory middleDirectory = directory;

        System.out.println(message);

        while (true) {

            int pos = 1;

            for (Directory innerDirectory : middleDirectory.getDirectories()) {
                System.out.println(pos++ + "- " + innerDirectory.getName());
            }

            System.out.println(pos + "- return this directory");


            choice = getIntValueWithLimit("Input the number", 1, pos);

            if (choice < pos) {
                middleDirectory = middleDirectory.getDirectories().get(choice - 1);
            } else {
                return middleDirectory;
            }


        }


    }


}
