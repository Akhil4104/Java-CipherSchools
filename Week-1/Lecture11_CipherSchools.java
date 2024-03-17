class A{
    final int x=26;
    final int y;
    A(){
        y=10;
    }
    final void fun(){
        System.out.println("Hi,I'm a function in class A");
    }
}
// final class B extends A{  Final class cannot be inherited
//     void fun(){
//         System.out.println("Hi,I'm a function in class B");
//     }
// }
class Lecture11_CipherSchools{
    public static void main(String args[]){
        A a=new A();
        a.fun();
        System.out.println("x: "+a.x+" y:" +a.y);
    }
}