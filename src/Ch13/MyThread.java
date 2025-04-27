package Ch13;



public class MyThread{
    public static void main(String[] args) {
        Runnable r = new MyThread1();
        Thread t1 = new Thread(r);
    }
}


class MyThread1 implements Runnable {


    @Override
    public void run() {

    }
}
