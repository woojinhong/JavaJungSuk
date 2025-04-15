//package Ch11;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Comparable {
//    public static void main(String[] args) {
//        Person[] people = {new Person("A", 20), new Person("B", 30)};
//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.age-o2.age;
//            }
//        }); // ❌ 오류! Comparable 구현 안됨
//    }
//}
//
//class Person {
//    String grade;
//    int age;
//
//    Person(String grade, int age){
//        this.grade = grade;
//        this.age = age;
//    }
//}
