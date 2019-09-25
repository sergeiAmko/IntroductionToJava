package module4ProgrammingWithClasses.elementaryClassesAndObjects.task1;

public class Test1 {
    private int a;
    private int b;

    public void setA(int newA) {
        this.a = newA;
    }

    public void setB(int newB) {
        this.b = newB;
    }

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
