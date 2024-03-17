class Student{
    String name;
    int marks;
    boolean checkPass(){
        if(marks>40){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Lecture8_CipherSchools_II {
    int findMax(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Ram";
        s1.marks=80;

        Student s2=new Student();
        s2.name="Sham";
        s2.marks=30;

        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        Lecture8_CipherSchools_II c=new Lecture8_CipherSchools_II();
        System.out.println(c.findMax(10,7,16));

        char ch='a';
        switch(ch){
            case 'a':
                System.out.println("Hi,I'm A");
            case 'b':
                System.out.println("Hi,I'm B");
            case 'c':
                System.out.println("Hi,I'm C");
            default:
                System.out.println("I'm not A,B or C");
        }
    }
}
