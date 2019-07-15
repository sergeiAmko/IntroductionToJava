package module1BasicOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task8 {
    public static void main(String[] args) {
        int m, n,k,m1;
        Scanner scanner = new Scanner(System.in);


        m = getIntValue(scanner, "Input real number m");
        n = getIntValue(scanner, "Input real number n");
        System.out.print("Overal figure: ");
        m1=abs(m);
        while (m1>0){
            k=m1%10;
            int n1= abs(n);
            while (n1>0){
                int t=n1%10;
                if (k==t){
                    System.out.print(k+", ");
                }
                n1/=10;
            }
            m1/=10;
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
