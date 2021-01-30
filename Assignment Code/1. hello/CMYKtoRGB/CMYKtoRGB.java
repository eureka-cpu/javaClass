public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]); // take level of cyan
        double m = Double.parseDouble(args[1]); // magenta
        double y = Double.parseDouble(args[2]); // yellow
        double k = Double.parseDouble(args[3]); // black

        double w = (1 - k); // white point
        int r = (int) Math.round(255 * w * (1 - c)); // calc red
        int g = (int) Math.round(255 * w * (1 - m)); // green
        int b = (int) Math.round(255 * w * (1 - y)); // blue

        System.out.println("red   = " + r);
        System.out.println("green = " + g);
        System.out.println("blue  = " + b);
    }
}
