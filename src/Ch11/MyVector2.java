package Ch11;

import java.util.Iterator;


public class MyVector2 extends MyVector implements Iterator {

    int cursor =0;
    int lastRet = -1;
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
        return null;
    }

    public Iterator iterator(){
        cursor =0;
        lastRet = -1;
        return this;
    }
}
