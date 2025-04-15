package Ch11;

import java.util.*;

public class MyVector implements List{

    Object[] data = null; // 객체를 담기 위한 객체배열을 선언한다.
    int capacity = 0; // 용량
    int size = 0;     // 크기

    public MyVector(int capacity){
        if(capacity < 0)
            throw new IllegalArgumentException("유효하지 않은 값입니다. :"+ capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }

    MyVector(){
        this(10);
    }

    public void ensureCapacity(int minCapacity){

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        // 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
        ensureCapacity(size+1);
        data[size++]= o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        // index가 data.length 범위내에 존재 예)길이 5 = index(0~4)
        if(index>=data.length || index<0)
            throw new IndexOutOfBoundsException("해당 배열의 요소가 존재하지 않습니다");
            // data 요소 출력
        return data[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    // index 위치의 객체를 삭제 후 객체를 반환
    @Override
    public Object remove(int index) {
        Object deleted;
        if(index >= data.length || index < 0)
            throw new IndexOutOfBoundsException("요소를 찾을 수 없답니다요구르트");
        deleted = data[index];
        // index 마지막 요소 객체가 아닐 시
        if(!(index==data.length-1)){
            // 요소 위치 아래 차례로 위로 이동
            for(int i = index; i < data.length; i++)
                data[index] = data[index+1];
        }
        // 요소가 마지막 위치라면 null로 변경
        data[index] = null;

        return deleted;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
