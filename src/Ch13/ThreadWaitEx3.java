//package Ch13;
//
//public class ThreadWaitEx3 {
//    public static void main(String[] args) {
//
//    }
//}
//
//class Customer implements Runnable{
//    private Table table;
//    private String food;
//
//    Customer(Table table, String food){
//        this.table = table;
//        this.food = food;
//    }
//    public void run(){
//        while(true){
//            try {
//                Thread.sleep(100);
//            }catch (InterruptedException e){
//
//            }
//            String name = Thread.currentThread().getName();
//
//            table.remove(food);
//            System.out.println(name + "ate a" + food);
//        }
//    }
//}
//
//class Cook implements  Runnable{
//    private Table table;
//
//    Cook(Table table){
//        this.table = table;
//    }
//}
