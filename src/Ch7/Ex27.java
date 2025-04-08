package Ch7;

public class Ex27 {
    public static void main(String[] args) {

        Outer1 outer1 = new Outer1();

        // 참조 변수 타입 = Outer1 클래스의 Inner1 클래스 타입 참조
        // outer1 객체의 new 연산자
        Outer1.Inner1 outerInner1 = outer1.new Inner1();
        outerInner1.method1();
    }
}

class Outer1{
    int value =10;

    class Inner1 {
        // 숨겨진 코드
/**
 * Inner1(Outer1 Outer1.this){
 *     super()
 * }

 * **/
        int value = 20;
        void method1(){
            int value =30;

            System.out.println("value = " + value);     // 지역
            System.out.println("value = " + this.value);     // 인스턴스
            System.out.println("value = " + Outer1.this.value);     // 외부
        }
    }
}