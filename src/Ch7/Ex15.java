package Ch7;

public class Ex15 {

    public static void main(String[] args) {
        AirCraft ac = new AirCraft();
        Unit u = new Unit();
        u = ac;

        ac = (AirCraft) u;
    }

}

class Unit{}
class AirUnit extends Unit{}

class AirCraft extends AirUnit{}