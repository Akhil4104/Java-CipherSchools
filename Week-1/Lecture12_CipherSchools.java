abstract class Car{
    int maxSpeed;
    abstract void accelerate();
    abstract void brake();
}
abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}
class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying Brakes");
    }
}
public class Lecture12_CipherSchools {
    public static void main(String[] args){
        // BMW beemer=new BMW(); cannot be instantiated abstract class
        // beemer.accelerate();
        BMW2 b=new BMW2();
        b.accelerate();
        b.brake();
    }
}
