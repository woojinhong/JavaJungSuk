package Ch11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
    public Object push(Object item){
        add(item);        // Vector 추가 메서드
        return item;
    }

    public Object pop(){
        // null 이거나 비어있으면 예외 발생
        if(elementCount==0){                        // length 는 배열의 크기(Capacity)를 반환, elementCount가 배열의 요소;
            throw new EmptyStackException();
        }
        Object obj = elementData[elementCount -1];  // 배열의 마지막 요소 저장

        elementCount--;

        elementData[elementData.length -1] = null;  // 마지막 요소 삭제

        return obj;
    }

    public boolean empty(){
        if(elementCount==0)
            return true;
        return false;
    }

}

