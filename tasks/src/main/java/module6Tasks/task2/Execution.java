package module6Tasks.task2;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static module6Tasks.task1.GetValues.getIntValue;
import static module6Tasks.task1.GetValues.getStringLine;

public class Execution {

    NoteCatalog noteCatalog;

    public Execution() {

        noteCatalog = new NoteCatalog();

    }

    public void action() {

        int choice;

        String infoStartMenu = "\nInput the number:\n" +
                "   1- get all notes\n" +
                "   2- search notes by parameters\n" +
                "   3- add new note\n" +
                "   other- Exit";


        while (true) {

            choice = getIntValue(infoStartMenu);


            switch (choice) {
                case 1:

                    printNotes(noteCatalog.getNotes());

                    break;

                case 2:

                    printNotes(search(noteCatalog.getNotes()));
                    break;
                case 3:


                    try {

                        noteCatalog.add(getStringLine("Input your subject of the note"),
                                getStringLine("Input your email"),
                                getStringLine("Input your message "));
                    } catch (IllegalArgumentException e) {

                        System.out.println(e.getMessage());

                    }


                    break;

                default:

                    noteCatalog.save();

                    System.exit(0);

            }
        }

    }


    public static List<Note> search(List<Note> notes) {

        int choice;
        boolean isDone = false;

        Map<String, String> parametersMap = new HashMap<>();
        List<Note> searched = null;

        String infoStartMenu = "\nInput the number:\n" +
                "   1- subject in parameters\n" +
                "   2- creation date in parameters\n" +
                "   3- message in parameters\n" +
                "   4- search\n" +
                "   other- back";
        while (!isDone) {

            String value;

            choice = getIntValue(infoStartMenu);

            switch (choice) {
                case 1:

                    value = getStringLine("Input parameter for subject");

                    if (!parametersMap.containsKey("subject")) {

                        parametersMap.put("subject", value);

                    }

                    break;

                case 2:

                    value = getStringLine("Input parameter for creation date");

                    if (!parametersMap.containsKey("creationdate")) {

                        parametersMap.put("creationdate", value);

                    }

                    break;

                case 3:

                    value = getStringLine("Input parameter for message");

                    if (!parametersMap.containsKey("message")) {

                        parametersMap.put("message", value);

                    }

                    break;
                case 4:

                    searched = NoteCatalog.searchByParameters(parametersMap, notes);
                    isDone = true;

                    break;

                default:

                    return null;
            }

        }
        return searched;

    }

    public static void printNotes(List<Note> notes) {

        if (notes != null && !notes.isEmpty()) {


            System.out.println("Notes:");

            for (Note note : notes) {

                System.out.print("  |" + note.getId());
                System.out.print(" |" + note.getCreationDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                System.out.print(" |" + note.getSubject());
                System.out.print(" |" + note.getEmail());
                System.out.println(" |" + note.getMessage() + "|");

            }
        }else {
            System.out.println("List is empty");
        }

    }

}
