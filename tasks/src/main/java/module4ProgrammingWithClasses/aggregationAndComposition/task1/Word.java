package module4ProgrammingWithClasses.aggregationAndComposition.task1;

public class Word {

    private String value;

    public Word(String value) {
        if (value != null) {
            this.value = value;
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
