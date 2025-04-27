package Ch14;

import java.util.Comparator;
import java.util.function.*;

@FunctionalInterface
interface MyFunction{
    void run();
}


public class LambadaPractice {
    static void execute(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction(){
        return ()-> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run() 구현
        Runnable f1 = ()-> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();

        f2.run();

        f3.run();

        execute(f3);

        execute(()-> System.out.println("run()"));

    }
}
