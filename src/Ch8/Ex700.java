package Ch8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex700 {
    public static void main(String[] args) {

        Point p = new Point();

        Point p2 = new Point();

        try{p2 = (Point)p.clone();}
        catch (CloneNotSupportedException e){
            e.printStackTrace();
            e.getMessage();
        }
        }
}

class Point implements Cloneable{
    int x, y;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

