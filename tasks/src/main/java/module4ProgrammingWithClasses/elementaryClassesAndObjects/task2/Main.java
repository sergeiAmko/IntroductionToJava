package module4ProgrammingWithClasses.elementaryClassesAndObjects.task2;


/**
 * Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и
 * get- методы для полей экземпляра класса.
 */
public class Main {
    public static void main(String[] args) {

        Test2 test1 = new Test2();
        Test2 test2 = new Test2(30, 50);

        System.out.println("test1.a= " + test1.getA());
        System.out.println("test1.b= " + test1.getB());

        test1.setA(10);
        test1.setB(20);

        System.out.println("test1.a= " + test1.getA());
        System.out.println("test1.b= " + test1.getB());

        System.out.println("test2.a= " + test2.getA());
        System.out.println("test2.b= " + test2.getB());


    }

}
