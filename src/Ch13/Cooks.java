package Ch13;

import java.util.ArrayList;
import java.util.List;

public class Cooks {

    static final int MAX_DISHES = 5;
    // 테이블 세팅 된 음식
    static List<Integer> dish = new ArrayList<Integer>(MAX_DISHES);

    public static void main(String[] args) {
        DaemonCook d = new DaemonCook();
        ThreadCus c = new ThreadCus();
        ThreadCus c1 = new ThreadCus();
        ThreadCus c2 = new ThreadCus();
        ThreadCus c3 = new ThreadCus();

        // cook를 데몬 쓰레드로
        d.th.setDaemon(true);
        c.start();
        c1.start();
        c2.start();
        c3.start();
        d.start();

    }
}

class DaemonCook implements Runnable{

    Thread th;

    DaemonCook(){
        th=new Thread(this);
    }

    void start(){
        th.start();
    }
    int i;
    @Override
    public void run() {
        // 무한 반복
        while (true){
            try {
                // 5초 기다림
                Thread.sleep(2000);
                if(Cooks.dish.size()==Cooks.MAX_DISHES) {
                    wait();
                }else{
                    // 배열에 음식 추가
                    Cooks.dish.add(i);
                    // 음식 버전
                    i++;
                    System.out.println("Cooks.dish = " + Cooks.dish);
                }
            } catch (InterruptedException e) {
                System.out.println("대기 상태로 들어감");
            }
        }
    }
}


class ThreadCus implements Runnable{

    Thread th;

    ThreadCus(){
        th=new Thread(this);
    }
    void start(){
        th.start();
    }

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
            eat();    // 먹기
            notify(); // 대기상태 쓰레드 깨우기
            System.out.println("대기 쓰레드 깨움!");
        }catch (InterruptedException e){

        }
    }


    void eat(){
        Cooks.dish.removeLast();
        System.out.println("음식 하나 먹음 = " + Cooks.dish);
    }
}
