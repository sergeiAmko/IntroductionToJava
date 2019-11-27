package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Дано натуральное число T, которое представляет дилетльность прошедшего времени в секундах.
 * Вывести данное значени длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSс.
 */
public class Task5 {
    public static void main(String[] args) {
        int t, h, min, sec;

        t = getIntValue("Input integer real number for time");

        h = t / 3600;
        min = (t - h * 3600) / 60;
        sec = t - h * 3600 - min * 60;

        System.out.println(String.format("%sчч %sмин %s сек", h, min, sec));
    }


}
