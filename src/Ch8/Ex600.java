package Ch8;

import java.util.Objects;

public class Ex600 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.equals(new Cat()));
    }
}

class Parent{
    String id;

    @Override
    public boolean equals(Object o) {
        // 있는지 모르니까 equals 비교가 안된다
        Cat cat = (Cat) o;
        return Objects.equals(id, cat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

class Cat{
    String id;
}