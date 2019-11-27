package module4ProgrammingWithClasses.elementaryClassesAndObjects.task5;

import static module4ProgrammingWithClasses.Service.getIntValue;


/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
 * свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика
 * значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения
 * и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать
 * код, демонстрирующий все возможности класса.
 */
public class Main {
    public static void main(String[] args) {
        int inner;
        int kindCounter;
        Counter counter;
        String creatCounter = "Input number:\n" +
                "1- set values\n" +
                "other number - defaults values";
        String infoActive = "Input number:\n" +
                "1-decrement\n" +
                "2-increment\n" +
                "3-getValue\n" +
                "4-exit";
        String strParameter1 = "Input current value";
        String strParameter2 = "Input lower limit value";
        String strParameter3 = "Input upper limit value";

        while (true) {

            kindCounter = getIntValue(creatCounter);

            if (kindCounter == 1) {
                int par1 = getIntValue(strParameter1);
                int par2 = getIntValue(strParameter2);
                int par3 = getIntValue(strParameter3);

                try {
                    counter = new Counter(par1, par2, par3);
                    break;

                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                }
            } else {
                counter = new Counter();
                break;
            }
        }


        while ((inner = getIntValue(infoActive)) >= 1 && inner <= 4) {
            switch (inner) {
                case 1:
                    counter.decrement();
                    System.out.println(counter.getMistake());
                    break;
                case 2:
                    counter.increment();
                    System.out.println(counter.getMistake());
                    break;
                case 3:
                    System.err.println("value= " + counter.getValue());
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }


}
