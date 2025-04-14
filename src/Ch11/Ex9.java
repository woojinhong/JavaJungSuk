package Ch11;

import java.util.Stack;

public class Ex9 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();


    public static void main(String[] args) {
        goUrl("1.네이트");
        goUrl("2.야후");
        goUrl("3.네이버");
        goUrl("4.다음");

        printStatus();

        goBack();

        goBack();

        goForward();


        goUrl("codeChobo");

    }

    private static void goBack() {
        if(!back.empty())
            forward.push(back.pop());

    }



    private static void goForward() {
        if(!forward.empty()){
            back.push(forward.pop());
        }
    }

    private static void printStatus() {

    }

    private static void goUrl(String url) {
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }
}
