package module4ProgrammingWithClasses.aggregationAndComposition.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {

    private String value;

    public Word(String value) {
        if (value!=null){
            Pattern pattern=Pattern.compile("\\w+");
            Matcher matcher=pattern.matcher(value);
//            if (matcher.find()){
                this.value = value;
//            }else {
//                this.value="default";
//            }
        }
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return value;
    }
}
