package Ch8;
// 예외를 발생시키는 메서드
// Overflow 감지를 위해 1.8jdk 이후에 나옴
public class Ex400 {

    public static void main(String[] args) {

        try {
            System.out.println(Math.multiplyExact(100000000, 222222222)); //Arithmetic Exception 발생
        }catch (ArithmeticException e){
            System.out.println("오버 플로우 발생 에러 났습니다용ㅇㄹㄴㅁㅇㄹㅇㅁㄹㄴㅇㅎ");
            e.printStackTrace();
            e.getCause();
            e.getMessage();
        }
    }
}
