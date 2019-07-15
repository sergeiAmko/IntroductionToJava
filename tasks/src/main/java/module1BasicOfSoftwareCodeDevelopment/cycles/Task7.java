package module1BasicOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int m=0,n=0;
        Scanner scanner = new Scanner(System.in);


        while (m<=0){
            m = getIntValue(scanner, "Input real number m");
        }
        while (n<=0){
            n = getIntValue(scanner, "Input real number n");
        }

        if (m>n){
            int k=m;
            m=n;
            n=k;
        }

        for (int i = m; i <=n ; i++) {
            if (i==0||i==1){
                continue;
            }
            System.out.print("All the devisors of "+i+"- ");
            for (int j = 2; j <i ; j++) {
                if (i % j == 0&&i!=j) {
                    System.out.print(j+", ");
                }
            }

            System.out.println();
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
