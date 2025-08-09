import java.util.Scanner;
public class Cgpa {
    public static void main(String[] args) {
        int sub1=56;
        int sub2=67;
        int sub3=78;
        float cg=sub1+sub2+sub3;
        float cgpa= cg/30;
        System.out.println(cgpa);
    Hello h=new Hello();
    h.greet();
    }
}
class Hello{
    void greet(){
        Scanner sc= new Scanner (System.in);
        String name= sc.next();
        System.out.println("hello "+name+" nice to meet you ");
    }
}
