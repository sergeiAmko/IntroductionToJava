package module6Tasks.task2;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class NoteService {


    public static boolean checkSubject(String subject) {
        return subject != null;
    }

    public static boolean checkEmail(String email) {

        if (email == null) {
            return false;
        }

        if (Pattern.matches("^[_A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z]{2,})$", email)) {

            return true;

        } else {
            return false;
        }


    }

    public static boolean checkMessage(String message) {
        return message != null;
    }

    public static boolean checkCreationDate(LocalDateTime localDateTime) {
        return localDateTime != null;
    }


}
