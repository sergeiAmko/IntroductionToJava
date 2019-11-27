package module4ProgrammingWithClasses.elementaryClassesAndObjects.task5;

public class Counter {
    private int currentValue;
    private int lowerLimit;
    private int upperLimit;
    private String mistake;

    public Counter(int currentValue, int lowerLimit, int upperLimit) {
        if (lowerLimit > upperLimit) {
            int g = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = g;
        }

        if (currentValue <= lowerLimit) {
            throw new IllegalArgumentException("Текущее значение меньше нижнего предела");
        }
        if (currentValue >= upperLimit) {
            throw new IllegalArgumentException("Текущее значение больше верхнего предела");

        }
        this.currentValue = currentValue;

        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public Counter() {
        this(0, 0, 20);
    }

    public String getMistake() {
        return mistake;
    }

    public void increment() {

        if (currentValue == upperLimit) {
            mistake = "Превышен верхний лимит.";
        } else {
            currentValue++;
            mistake = "";
        }
    }

    public void decrement() {

        if (currentValue == lowerLimit) {
            mistake = "Превышен нижний лимит. Нижний лимит= ";
        } else {
            currentValue--;
            mistake = "";
        }
    }

    public int getValue() {
        return currentValue;
    }
}
