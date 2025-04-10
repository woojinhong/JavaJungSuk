package Ch8;




// 8-23 chainedException
public class Ex102 {
    public static void main(String[] args) {
        try {
            install();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
        }finally {
            tempSpace();
        }

    }

    private static boolean tempSpace() {
        return false;
    }

    private static void install() {
        if(!enoughSpace1()){
            throw new MynewException();
        }
        if(!enoughMemory1()){
            throw new RuntimeException(new MemoryloseException());
        }
    }

    private static boolean enoughMemory1() {
        return false;
    }

    private static boolean enoughSpace1() {
        return false;
    }
}
class MynewException extends RuntimeException{

}
class MemoryloseException extends Exception{

}