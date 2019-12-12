package module6Tasks.task1;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class MailService {

    private static final String username = "my@gmail.com";
    private static final String password = "my";


    public static void send(List<User> usersAccept, Book book, String subject) {

        new Thread(() -> {
            List<String> usersEmail = usersAccept.stream().map(User::getEmail).collect(Collectors.toList());

            String text = "A new a book was added to the library\n\n" +
                    "   name- " + book.getName() + "\n" +
                    "   authors- " + book.getAuthors() + "\n" +
                    "   year publication- " + book.getYearPublishing() + "\n" +
                    "   description- " + book.getDescription();

            for (String email : usersEmail) {

                send(email, subject, text);
            }
        }).start();


    }


    private static boolean send(String to, String subject, String text) {




        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(prop,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });


        try {

            Message message = new MimeMessage(session);

            message.setSubject(subject);
            message.setText(text);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            Transport.send(message);


        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return true;
    }

}
