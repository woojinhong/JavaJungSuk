package Ch12;

class Unit{}
class GroundUnit extends Unit{}
class Tank extends GroundUnit{}
public class Generics {
    public static void main(String[] args) {

        Unit u = new GroundUnit();

        Tank t = new Tank();

        t = (Tank)u;
    }
}
