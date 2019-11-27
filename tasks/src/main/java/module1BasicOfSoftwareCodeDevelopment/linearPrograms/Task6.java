package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (x,y)
 * принадлежитзакрашенной области, и false - в противном случае.
 */
public class Task6 {
    public static void main(String[] args) {
        int x, y;

        x = getIntValue("Input integer number x ");
        y = getIntValue("Input integer number y ");

        if (y <= 0 && y >= -3 && Math.abs(x) <= 4 ||
                y > 0 && y <= 4 && Math.abs(x) <= 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


}
