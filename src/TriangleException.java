import java.util.*;

public class TriangleException {
    public static void triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0) throw new IllegalTriangleException("Lỗi nhập cạnh nhỏ hơn 0 !");
        if (a+b<=c || b+c<=a || a+c<=b) throw new IllegalTriangleException("Không tồn tại tam giác !");
    }
    public static void main(String[] args) {
        System.out.println("Nhập 3 cạnh tam giác:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh đầu tiên:");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh thứ hai:");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh thứ ba:");
        int c = sc.nextInt();
        try {
            triangle(a,b,c);
            System.out.println("Tam giác có ba cạnh: " + a + ", " + b + ", " + c);
        }
        catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
