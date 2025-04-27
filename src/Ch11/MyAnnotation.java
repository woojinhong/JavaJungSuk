package Ch11;

import java.lang.annotation.*;
import java.lang.reflect.Type;

@Target({ElementType.TYPE_USE})      // 애너테이션이 적용될 타입 공간
@Retention(value = RetentionPolicy.SOURCE)  // 실행 시점의 해당 애너테이션 확인
@Inherited                      // 자식 클래스에도 애너테이션 상속 됨
public @interface MyAnnotation {
    int count();
}
