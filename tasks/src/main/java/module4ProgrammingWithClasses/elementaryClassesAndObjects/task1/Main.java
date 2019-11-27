package module4ProgrammingWithClasses.elementaryClassesAndObjects.task1;


/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который
 * находит наибольшее значение из этих двух переменных.
 */
public class Main {
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.a = 10;
        test1.b = 20;

        test1.print();
        System.out.println("sum= " + test1.sum());
        System.out.println("max= " + test1.largestNumber());
    }
}
