package Ch6;

public class Ex4 {
    public static void main(String[] args) {

        Student1 s = new Student1("홍길동", 1,1,100,60,76);

        System.out.println("s.getTotal() = " + s.getTotal());
        System.out.println("s.getAverage() = " + s.getAverage());
        
    }
}

class Student1{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return Math.round((getTotal()/3f)*10)/10f;
    }
}
