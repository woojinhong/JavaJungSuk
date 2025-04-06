package Ch6;

public class Ex6 {
    public static void main(String[] args) {

        a s = new a();
        s.instancemethod();
    }
}
class a{
    int iv = 10;

    void instancemethod(){
        System.out.println(iv);
    }
}
