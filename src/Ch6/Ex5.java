package Ch6;

public class Ex5 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동", 1,1,100,60,76);

        System.out.println(s.info());

    }
}


class Student2{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
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
    String info() {
        return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f\n",
                name, ban, no, kor, eng, math, getTotal(), getAverage());
    }

}