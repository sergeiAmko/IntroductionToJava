package module1BasicOfSoftwareCodeDevelopment.cycles;

import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        int n, sum = 0;

        n = getIntValue("Input real number");

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("n= " + n + "\n" +
                "sum= " + sum);

    }

}
