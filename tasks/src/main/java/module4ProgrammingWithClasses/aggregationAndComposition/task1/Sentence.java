package module4ProgrammingWithClasses.aggregationAndComposition.task1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words=new ArrayList<>();

    public Sentence(List<Word> innerSentence) {
        if (innerSentence!=null){
            this.words = innerSentence;
        }
    }

    public Sentence(){

    }

    public List<Word> getWords() {
        return words;
    }


    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < words.size(); i++) {
            stringBuffer.append(words.get(i) + " ");
        }

        return stringBuffer.toString();
    }

    public void add(List<Word> words) {
        if (words!=null){
            this.words.addAll(words);
        }
    }

    public void add(Word word) {
        if (word != null) {
            this.words.add(word);
        }
    }
}
