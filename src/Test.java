
import static java.lang.System.out;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        out.println("Your Rollno");
        int rno=sc.nextInt();
        sc.nextLine();
        out.println("Your Name");
        String name=sc.nextLine();
        out.println("Your Age");
        int age=sc.nextInt();
        sc.nextLine();
        out.println("Your College");
        String college=sc.nextLine();
        out.println(rno+","+name+","+age+","+college);
                
}
            
}
