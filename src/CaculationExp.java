import java.util.Scanner;

public class CaculationExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so x");
        int x = scanner.nextInt();

        System.out.println(" nhap vao so y");
        int y = scanner.nextInt();

        CaculationExp calc = new CaculationExp();
        calc.calculate(x,y);
    }

    private   void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x*y;
            int d = x/y;
            System.out.println(" tong = " + a);
            System.out.println(" hieu = " + b);
            System.out.println(" tich = " + c);
            System.out.println(" thuong = " + d);
        }catch (Exception e){
            System.out.println(" xay ra ngoai le " + e.getMessage());
        }
    }
}
