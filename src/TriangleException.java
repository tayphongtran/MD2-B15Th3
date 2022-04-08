import java.util.Scanner;



        public class TriangleException {
            public static void main(String[] args) throws Exception {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Nhap a: ");
                int a= scanner.nextInt();
                System.out.println("Nhap b: ");
                int b= scanner.nextInt();
                System.out.println("Nhap c: ");
                int c= scanner.nextInt();
//        checkTriangle();
                try {
                    triangle1(a,b,c);
                    System.out.println("la tam giac");
                }catch (Exception e) {
                    System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
                }
            }


            public static void triangle1(int a, int b, int c) throws Exception {
                if (a < 0 || b < 0 || c < 0) {
                    throw new Exception("Do dai phai lon hon 0");
                }
                if (a + b < c || a + c < b || b + c < a) {
                    throw new Exception("Do dai hai canh phai lon hon canh con lai");
                }
            }



        }

