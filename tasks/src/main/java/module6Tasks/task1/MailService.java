package module6Tasks.task1;

import java.util.List;

public class MailService {


    public static boolean send(List<User> usersAccept, Book book) {

        System.out.println("_______________________________________________________________________________");
        System.out.println("Message was sent- "+book.getName());
        System.out.println("_______________________________________________________________________________");
        return true;
    }

}
