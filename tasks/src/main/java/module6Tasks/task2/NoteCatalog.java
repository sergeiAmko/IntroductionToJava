package module6Tasks.task2;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteCatalog {

    private List<Note> notes = new ArrayList<>();
    private List<Note> searched;
    private List<Integer> ids = new ArrayList<>();

    public NoteCatalog() {
        create();
    }

    private void create() {

        try {

            List<String> strings = IO.read();

            for (int i = 0; i < strings.size(); i++) {

                int id;
                LocalDateTime localDateTime;
                String subject;
                String email;
                String message;
                Note note;

                id = Integer.parseInt(strings.get(i++));


                while (ids.contains(id)) {
                    id = Note.getGenerateID();
                }

                try {

                    localDateTime = LocalDateTime.parse(strings.get(i++), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                } catch (DateTimeParseException e) {
                    localDateTime = null;
                    System.out.println("Date recognition error");
                }

                subject = strings.get(i++);
                email = strings.get(i++);
                message = strings.get(i);

                if (localDateTime != null) {

                    note = new Note(id, localDateTime, subject, email, message);
                    notes.add(note);
                    ids.add(id);
                }

            }

        } catch (IOException e) {
            System.err.println("File not found, was created new file for saving");
        }


    }

    public boolean add(String subject, String email, String message) {

        int id;

        do {
            id = Note.getGenerateID();
        }
        while (ids.contains(id));

        Note note = new Note(id, LocalDateTime.now(), subject, email, message);
        notes.add(note);
        ids.add(id);

        return true;

    }

    public static List<Note> searchByParameters(Map<String, String> parameters, List<Note> searchedInput) {

        List<Note> searched = searchedInput;
        List<Note> newSearched;

        Pattern pattern;
        Matcher matcher = null;

        for (Map.Entry<String, String> parameter : parameters.entrySet()) {

            pattern = Pattern.compile(parameter.getValue());

            newSearched = new ArrayList<>();


            for (Note note : searched) {


                switch (parameter.getKey().toLowerCase()) {
                    case "subject":

                        matcher = pattern.matcher(note.getSubject());

                        break;

                    case "email":

                        matcher = pattern.matcher(note.getEmail());

                        break;

                    case "creationdate":

                        try {


                            if (note.getCreationDate().toLocalDate().equals(LocalDate.parse(parameter.getValue()))) {

                                newSearched.add(note);

                            }
                            continue;


                        } catch (DateTimeParseException e) {

                            System.err.println("The date entered is incorrect");

                        }

                        break;

                    case "message":

                        matcher = pattern.matcher(note.getMessage());


                        break;

                    default:
                        continue;


                }

                if (matcher != null && matcher.find()) {

                    newSearched.add(note);
                    matcher = null;

                }


            }

            searched = newSearched;
        }

        searched.sort(Note::compareTo);

        return searched;

    }

    public List<Note> getNotes() {
        return notes;
    }

    public boolean save() {

        List<String> strings = new ArrayList<>();

        for (Note note : notes) {

            strings.add("" + note.getId());
            strings.add(note.getCreationDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            strings.add(note.getSubject());
            strings.add(note.getEmail());
            strings.add(note.getMessage());


        }

        try {

            IO.write(strings);

            return true;

        } catch (IOException e) {
            System.out.println("Saving date to file is error");
        }

        return false;
    }


}
