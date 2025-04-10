package Ch8;

public class Ex201 {
    public static void main(String[] args) {
        Person p = new Person(10);
        Person p1 = new Person(10);
        String str = new String("안녕");
        String str2 = new String("안녕zzzzz");
        System.out.println(p.equals(p1));  // 객체 주소 비교
        str2= str;

        System.out.println("str.equals(str2) = " + str.equals(str2));
    }
}
class Person{

    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return age == ((Person)obj).age;
    }
}