package module4ProgrammingWithClasses.elementaryClassesAndObjects.task1;

public class Test1 {
    public int a;
    public int b;


    public void print() {
        System.out.println("a= " + a + "\nb= " + b);
    }

    public int sum() {
        return a + b;
    }

    public int largestNumber() {
        return a > b ? a : b;
    }
}
