package module4ProgrammingWithClasses.elementaryClassesAndObjects.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Random random = new Random();

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student("Student" + i, "S.A.", 513 + i,
                    new int[]{10, random.nextInt(10), 10, random.nextInt(10), 10});

        }

        for (Student student : students) {
            student.printEvolutionMore10();
        }
    }
}
