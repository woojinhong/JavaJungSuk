package Ch13;

public class ThreadGC {
    HeapGc gc = new HeapGc();
}

class HeapGc implements Runnable{

    Thread th;

    HeapGc(){
        th=new Thread(this);
    }

    @Override
    public void run() {

    }
}