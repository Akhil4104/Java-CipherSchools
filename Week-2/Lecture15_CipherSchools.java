public class Lecture15_CipherSchools {
        int x=10;
        private int y=20;
        protected int z=20;
        public int w=25;
    public static void main(String args[]){
        Lecture15_CipherSchools obj=new Lecture15_CipherSchools();
        System.out.println(obj.x);//defualt is accessible in same package
        System.out.println(obj.y);//private not accesible outside the class
        System.out.println(obj.z);//public is accessible everywhere
        System.out.println(obj.w);//protected will not accessible outside the class
    }
}
