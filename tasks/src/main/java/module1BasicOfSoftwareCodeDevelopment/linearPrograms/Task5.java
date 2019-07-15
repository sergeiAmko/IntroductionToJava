package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int t,h,min,sec;
        Scanner scanner=new Scanner(System.in);

        t= getIntValue(scanner,"Input integer real number for time");

        h=t/3600;
        min=(t-h*3600)/60;
        sec=t-h*3600-min*60;

        System.out.println(String.format("%sчч %sмин %s сек",h,min,sec));
    }

    private static int getIntValue(Scanner scanner, String message) {
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
