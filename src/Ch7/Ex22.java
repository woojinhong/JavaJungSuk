package Ch7;

public class Ex22 {
    public static void main(String[] args) {

    }
}
class Point{
    int x;
    int y;
    Point(){
        this(0,0);
    }
    Point(int x, int y){
        this.x = x;
        this.y= y;
    }
    public String toString(){
        return "["+x+","+y+"]";
    }
}
abstract class Shape{
    Point p;
    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p) {
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
class Circle extends Shape {
    double r;  // 반지름

    Circle() {
    }

    Circle(double r) {
        super();
        this.r = r;
    }
    @Override
    double calcArea() {

        // 원 넓이 공식
        return Math.PI * (r*r);
    }
}

    class Rectangle extends Shape{
        double width;
        double height;

        Rectangle(){}

        Rectangle(double width, double height){
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
