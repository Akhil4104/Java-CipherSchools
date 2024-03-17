interface M{
    int x=10;
    void fun();
}
interface N{
    int x=20;
    void fun();
}
class C implements M,N{
    public void fun(){
        System.out.println("Hello!");
        System.out.println(M.x);
        System.out.println(N.x);
        System.out.println(M.super.hashCode());
        System.out.println(N.super.hashCode());
    }
}
public class Lecture13_CipherSchools {
    public static void main(String[] args){
        C c=new C();
        c.fun();
    }
}
