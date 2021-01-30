public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        double tdouble = t;
        long stepbank = 0;
        for (int i = 0; i < t; i++) {
            int x = 0, y = 0;
            long steps = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double v = Math.random();
                if (v < 0.25) x--;
                else if (v < 0.50) x++;
                else if (v < 0.75) y--;
                else y++;
                steps++;
            }
            stepbank += steps;
        }
        if (t == 0) {
            System.out.println("average number of steps = " + 0);
        }
        else {
            System.out.println("average number of steps = " + stepbank / tdouble);
        }
    }
}
