public class Lecture23_CipherSchools {
    static boolean isPrimeRam(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean isPrimeSham(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n=100;
        System.out.println(isPrimeRam(n));
        System.out.println(isPrimeSham(n));
    }
}
