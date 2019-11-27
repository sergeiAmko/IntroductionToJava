package module4ProgrammingWithClasses.aggregationAndComposition.task1;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> sentences;
    private String title;

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public Text(String title) {
        sentences = new ArrayList<>();
        this.title = title;
    }


    public List<Sentence> getSentences() {
        return sentences;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < sentences.size(); i++) {
            stringBuilder.append(sentences.get(i));
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" "));
            stringBuilder.append(".");
        }

        return stringBuilder.toString();

    }


    public void add(Sentence sentence) {
        if (sentence != null) {
            this.sentences.add(sentence);
        }
    }

    public void print() {
        this.toString();
    }

}
