package Ch2;

public class Ex2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp;


        tmp = x;
        x = y;
        y = tmp;

        System.out.println(x+","+ y);

    }
}
