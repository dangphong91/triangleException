public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Some error!");
    }
    public IllegalTriangleException(String s) {
        super(s);
    }
}
