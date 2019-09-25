package module4ProgrammingWithClasses.elementaryClassesAndObjects.task5;

import java.util.Scanner;

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

        kindCounter = getIntValue(creatCounter);

        switch (kindCounter) {
            case 1:
                int par1 = getIntValue(strParameter1);
                int par2 = getIntValue(strParameter2);
                int par3 = getIntValue(strParameter3);

                counter = new Counter(par1, par2, par3);
                break;
            default:
                counter = new Counter();
                break;

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

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }


}
