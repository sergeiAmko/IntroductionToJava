package module4ProgrammingWithClasses.elementaryClassesAndObjects.task3;

import java.util.Random;


/**
 * . Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
 * номер группы, успеваемость (массив из пяти элементов). Создайте массив
 * из десяти элементов такого типа. Добавьте возможность вывода фамилий
 * и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
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
