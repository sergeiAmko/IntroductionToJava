package module4ProgrammingWithClasses.elementaryClassesAndObjects.task7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
    private Point topA;
    private Point topB;
    private Point topC;

    private double sideA;
    private double sideB;
    private double sideC;

    private Triangle(Point topA, Point topB, Point topC) {

        if (!isLine(topA, topB, topC)) {

            this.topA = topA;
            this.topB = topB;
            this.topC = topC;
        }else {
            this.topA = new Point(0,0);
            this.topB = new Point(0,6);
            this.topC = new Point(8,0);
        }

        sideA=side(topA,topB);
        sideB=side(topB,topC);
        sideC=side(topC,topA);
    }

    private static double side(Point point1,Point  point2){
        return sqrt(pow((point1.getX()-point2.getX()),2)+pow((point1.getY()-point2.getY()),2));
    }

    private static boolean isLine(Point topA, Point topB, Point topC) {
        return (topC.getY() - topA.getY()) * (topB.getX() - topA.getX()) == (topB.getY() - topA.getY()) * (topC.getX() - topA.getX());
    }


    static Triangle createTriangle() {
        return new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));
    }

    static Triangle creTriangle(Point pointA, Point pointB, Point pointC) {
        return new Triangle(pointA, pointB, pointC);
    }

    private double halfPerimeter() {
        return perimeter() / 2;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        return sqrt(halfPerimeter() * (halfPerimeter() - sideA) *
                (halfPerimeter() - sideB) *
                (halfPerimeter() - sideC));
    }

    public Point pointOfIntersectionOfMedians(){
        return new Point((topA.getX()+topB.getX()+topC.getX())/3,(topA.getY()+topB.getY()+topC.getY())/3);
    }



}
