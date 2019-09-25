package module4ProgrammingWithClasses.elementaryClassesAndObjects.task10;

import java.time.DayOfWeek;
import java.util.HashSet;
import java.util.Set;

public class DayOfWeekUtils {

    public static boolean containsElement(DayOfWeek[] dayOfWeeks, DayOfWeek containDayOfWeek) {
        for (int i = 0; i < dayOfWeeks.length; i++) {
            if (dayOfWeeks[i] == containDayOfWeek) {
                return true;
            }
        }
        return false;
    }

    public static int countUniqueElements(DayOfWeek[] daysOfWeek) {
        Set<DayOfWeek> daysUnique = new HashSet<>();

        for (int i = 0; i < daysOfWeek.length; i++) {
            daysUnique.add(daysOfWeek[i]);
        }

        System.out.println(daysUnique.size());
        return daysUnique.size();
    }

}
