package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import static module1BasicOfSoftwareCodeDevelopment.Service.getDoubleValue;


/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и цулую части числа и вывести полученное значение числа.
 */
public class Task4 {
    public static void main(String[] args) {

        double r, newNumber;
        int integerPart;

        r = getDoubleValue("Input number formats nnn.ddd");

        integerPart = (int) Math.round(((r - (int) r) * 1000));
        newNumber = integerPart + (double) ((int) r / 1000);

        System.out.println(newNumber);
    }


}
