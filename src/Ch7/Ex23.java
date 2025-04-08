package Ch7;


import java.util.Arrays;

public class Ex23 {
    static double sum = 0;
    static double sumArea(Shape[] arr){
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i].calcArea();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Shape[] arr ={new Circle1(5.0),new Rectangle1(3,4), new Circle1(1)};

        System.out.println("sumArea(arr) = " + sumArea(arr));
    }
}
class Point1{
    int x;
    int y;
    Point1(){
        this(0,0);
    }
    Point1(int x, int y){
        this.x = x;
        this.y= y;
    }
    public String toString(){
        return "["+x+","+y+"]";
    }
}
abstract class Shape1{
    Point p;
    Shape1(){
        this(new Point(0,0));
    }
    Shape1(Point p) {
        this.p = p;
    }
    abstract double calcArea();  // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition(){
        return p;
    }
    void setPosition(Point p){
        this.p=p;
    }
}
class Circle1 extends Shape {
    double r;  // 반지름

    Circle1() {
    }

    Circle1(double r) {
        super();
        this.r = r;
    }
    @Override
    double calcArea() {

        // 원 넓이 공식
        return Math.PI * (r*r);
    }
}

class Rectangle1 extends Shape{
    double width;
    double height;

    Rectangle1(){}

    Rectangle1(double width, double height){
        super();
        this.width=width;
        this.height=height;
    }

    @Override
    double calcArea() {
        // 사각형 넓이 공식
        return width*height;
    }

    boolean isSquare(){
        // 정사각형 유효성 체크
        return width == height;
    }

}
