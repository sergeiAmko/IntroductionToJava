package module1BasicOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0, a = 100;
        for (int i = 1; i <= a; i++) {
            sum += pow(i, 2);
        }

        System.out.println("sum= " + sum);
    }

}
