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
        sentences=new ArrayList<>();
        this.title=title;
    }


    public List<Sentence> getSentences() {
        return sentences;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer=new StringBuffer();

        for (int i = 0; i < sentences.size(); i++) {
            stringBuffer.append(sentences.get(i));
            stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(" "));
            stringBuffer.append(".");
        }

        return stringBuffer.toString();

    }


    public void add(Sentence sentence) {
        if (sentence != null) {
            this.sentences.add(sentence);
        }
    }

    public void print(){
        this.toString();
    }

}
