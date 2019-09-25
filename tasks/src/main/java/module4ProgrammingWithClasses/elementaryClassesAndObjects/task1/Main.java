package module4ProgrammingWithClasses.elementaryClassesAndObjects.task1;

public class Main {
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.setA(10);
        test1.setB(20);

        test1.print();
        System.out.println("sum= " + test1.sum());
        System.out.println("max= " + test1.largestNumber());
    }
}
