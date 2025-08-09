import java.util.Scanner;
public class KmMile {
    public static void main(String[] args){

        KmMile obj= new KmMile();
        obj.kmMile();
        obj.findInt();
    }
    void kmMile(){
        Scanner sc= new Scanner(System.in);
        int km= sc.nextInt();
        double mile= 0.6213712*km;
        System.out.println(km +"km to mile = " + mile + " mile");
    }
    void findInt(){
        Scanner sc= new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
