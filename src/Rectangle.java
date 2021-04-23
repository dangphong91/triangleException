public class Rectangle {
    private int a,b,c;
    public Rectangle(int a, int b, int c) throws Exception{
        this.a = a;
        this.b = b;
        this.c = c;
        if (a+b<=c || a+c<=b || b+c<=a || a<=0 || b<=0 || c<=0) {
            throw new Exception();
        }
    }
}
