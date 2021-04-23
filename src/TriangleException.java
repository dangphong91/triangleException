import java.util.*;

public class TriangleException {
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
            Rectangle abc = new Rectangle(a,b,c);
            System.out.println("Tam giác có ba cạnh: " + a + ", " + b + ", " + c);
        }
        catch (Exception e) {
            System.out.println("Input error!" + e.getMessage());
        }
    }
}
