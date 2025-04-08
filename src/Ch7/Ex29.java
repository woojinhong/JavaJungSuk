package Ch7;

public class Ex29 {
    int iv = 20;
    static int cv = 111;



    void method(){      // 메서드 소멸 시점
       int lv= 0;       // 지역변수 소멸     // final 생략됨
        class Inner2 {
            int a = lv;  // Inner2 객체의 변수 a가 소멸된 method() 지역변수를 참조하려 해서 에러
                            // 1.8부터는 낫에러
        }
    }
}
