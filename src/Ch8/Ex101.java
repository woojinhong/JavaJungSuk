package Ch8;

// 8-21
public class Ex101 {
    public static void main(String[] args) {
        try{
            startInstall();  // 설치할 파일

        }catch (SpaceException e){
            System.out.println(e.getMessage());
            System.out.println("e.getERR_CODE() = " + e.getERR_CODE());
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void startInstall()throws SpaceException, RuntimeException {
        if(!enoughSpace()){
            throw new SpaceException("공간 부족", 400);
        }
        if(!enoughMemory()){
            throw new RuntimeException(new MemoryException("메모리 부족")); // Exception(checked) 예외를 runtimeException(unchecked)예외로 감싸기
        }
    }

    static boolean enoughSpace() {
        return false;  // 무조건 공간 부족
    }

    static boolean enoughMemory() {
        return false; // 무조건 메모리 부족
    }
}

class SpaceException extends Exception{

    private final int ERR_CODE;
    SpaceException(String msg, int err_code){
        super(msg);
        ERR_CODE = err_code;
    }

    public int getERR_CODE(){
        return ERR_CODE;
    }
}

class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}