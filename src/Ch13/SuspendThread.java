package Ch13;

public class SuspendThread {
    public static void main(String[] args) {

    RunImpl r = new RunImpl("*");
    RunImpl r1 = new RunImpl("**");
    RunImpl r2 = new RunImpl("***");
    r.start();
    r1.start();
    r2.start();

    try{
        Thread.sleep(2000);
        r.suspend();
        Thread.sleep(2000);
        r1.suspend();
        Thread.sleep(2000);
        r2.suspend();
        Thread.sleep(2000);
        r.resume();
        Thread.sleep(2000);
        r1.stop();
        Thread.sleep(2000);
        r1.resume();
        Thread.sleep(2000);
        r.stop();
        r2.stop();

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    }
}


class RunImpl implements Runnable{

    volatile boolean suspended = false;
    volatile boolean stopped = false;

    Thread th;

    RunImpl(String name){
        th = new Thread(this,name);
    }

    @Override
    public synchronized void run() {
        synchronized (this) {
            while (!stopped) {
                if (!suspended) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + "- stopped");
    }

    public void start(){th.start();}
    public void suspend(){suspended = true;}
    public void resume(){suspended = false;}
    public void stop(){stopped = true;}
}
