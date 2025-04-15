package Ch11;

import java.util.Iterator;


public class MyVector2 extends MyVector implements Iterator {

    int cursor =0;                       // 앞으로 읽어 올 요소의 위치를 저장
    int lastRet = -1;                    // 마지막으로 읽어 온 요소의 위치를 저장


    MyVector2(){
        this(10);
    }
    MyVector2(int capacity){
        super(capacity);
    }

    @Override
    public boolean hasNext() {
        return cursor != size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);        // get으로 객체를 읽어드림
        lastRet = cursor++;
        return next;
    }

    public Iterator iterator(){
        cursor =0;
        lastRet = -1;
        return this;
    }

    @Override
    public String toString() {
        String tmp = "";
        Iterator it = iterator();

        for(int i = 0; it.hasNext(); i++){
            if(i!=0) tmp+=", ";
            tmp+= it.next();           // tmp += next().toString();
        }
        return  "["+ tmp +"]";
    }

    @Override
    public void remove() {
        if(lastRet == -1){
            throw new IllegalArgumentException();
        }
        else{
            remove(lastRet);
            cursor--;
            lastRet = -1;
        }
    }
}
