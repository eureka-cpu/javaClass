public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int x = a * a + b * b;
        int y = c * c + b * b;
        int z = a * a + c * c;
        System.out.println(a > 0 && b > 0 && c > 0 && (c * c == x || a * a == y || b * b == z));
    }
}
