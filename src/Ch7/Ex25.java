package Ch7;

public class Ex25 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner ol = outer.new Inner();
        System.out.println(ol.iv);
    }
}

class Outer{
    class Inner{
        int iv = 100;
    }
}

