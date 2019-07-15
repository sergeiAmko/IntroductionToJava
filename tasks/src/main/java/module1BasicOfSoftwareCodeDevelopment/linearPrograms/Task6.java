package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int x, y;
        double delta = 1e-10;

        Scanner scanner = new Scanner(System.in);
        x = getIntValue(scanner, "Input integer number x ");
        y = getIntValue(scanner, "Input integer number y ");

        if (y<=0&&y>=-3&&Math.abs(x)<=4||
                y>0&&y<=4&&Math.abs(x)<=2){
            System.out.println("true");
        }else {
            System.out.println(false);
        }
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
