package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        long a;
        String s="Input numer";

        a=getIntValue(s);

        System.out.println(Arrays.toString(elements(a)));
    }

    private static long getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        while (true) {
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static long[] elements(long a){
        int count=0,i=0;
        long b=a;
        while (b>0){
            b=b/10;
            count++;
        }

        long[] output=new long[count];

        while (a>0){
            output[i]=a%10;
            i++;
            a/=10;
        }
        return output;
    }

}
