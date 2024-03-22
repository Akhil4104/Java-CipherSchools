import java.util.Scanner;
public class Lecture21_CipherSchools {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName=sc.next();
        String lastName=sc.next();
        System.out.println("Please enter your profession: ");
        String profession=sc.next();
        System.out.println("Please enter your address: ");
        String address=sc.nextLine();

        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Profession: "+profession);
        System.out.println("Address: "+address);
    }
}
