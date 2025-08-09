import java.util.Scanner;

class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        float max = sc.nextFloat();


        float tot = (a + b + c + d + e);
        float per = (tot / max) * 100;
        System.out.println(per);
        ThreeSum obj = new ThreeSum();
        obj.cal();
    }
}
    class ThreeSum{
        void cal() {
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            int r = sc.nextInt();
            int p = sc.nextInt();
            int sum = p + q + r;
            System.out.println(sum);
        }
    }

