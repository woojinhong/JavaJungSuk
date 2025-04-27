package Ch13;

import java.util.Collections;
import java.util.Scanner;

public class Strategy {
    public static void main(String[] args) {

        GyulJeProcess payment = new GyulJeProcess();

        Scanner sc = new Scanner(System.in);
        String method = sc.nextLine();

        payment.pay(method);

    }
}


class GyulJeProcess{

    void pay(String payment){
        if(payment.equals("CARD")){

        }

    }

}