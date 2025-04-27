package Ch12;


public class getDistance {
    public static void main(String[] args) {

        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));

    }
}
class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double getDistance(int x1, int y1){
        return Math.sqrt(Math.pow((this.x-x1),2) + Math.pow((this.y-y1),2));
    }
}