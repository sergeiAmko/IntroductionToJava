package module6Tasks.task2;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

import static module6Tasks.task2.NoteService.*;

public class Note implements Comparable<Note> {

    private static int GenerateID = 0;

    private int id;
    private LocalDateTime creationDate;
    private String subject;
    private String email;
    private String message;


    public Note(int id, LocalDateTime creationDate, String subject, String email, String message) {

        if (id >= 0) {

            if (id >= GenerateID) {
                GenerateID = id;
            }

            this.id = id;
        }

        if (checkSubject(subject)) {
            this.subject = subject;
        } else {
            throw new IllegalArgumentException("Subject is incorrect");
        }

        if (checkEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email is incorrect");

        }

        if (checkMessage(message)) {
            this.message = message;
        } else {
            throw new IllegalArgumentException("Message is incorrect");

        }

        if (checkCreationDate(creationDate)) {

            this.creationDate = creationDate;
        }
    }


    public static int getGenerateID() {
        return GenerateID++;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", creationDate=" + creationDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                ", subject='" + subject + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return id == note.id &&
                Objects.equals(creationDate, note.creationDate) &&
                Objects.equals(subject, note.subject) &&
                Objects.equals(email, note.email) &&
                Objects.equals(message, note.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creationDate, subject, email, message);
    }


    @Override
    public int compareTo(@NotNull Note o) {

        return Comparator.comparing(Note::getCreationDate).thenComparing(Note::getSubject).compare(this, o);

    }
}
