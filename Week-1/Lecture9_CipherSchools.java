class A{
    int a,b;
    public void show(){
        System.out.println("Hello!");
    }
}
// class B{
//     int c,d;
//     public void write(){
//         System.out.println("Writing!");
//     }
// }
interface B{
    public void eat();
}
interface D extends B{
    public void sleep();
}
class C implements D{
    int e,f;
    public void speak(){
        System.out.println("Speaking!");
    }
    public void eat(){
        System.out.println("Eating!");
    }
    public void sleep(){
        System.out.println("Sleeping!");
    }
}
public class Lecture9_CipherSchools {
    public static void main(String args[]){
        // B b=new B();
        C c=new C();
        c.eat();
        c.sleep();
    }
}
