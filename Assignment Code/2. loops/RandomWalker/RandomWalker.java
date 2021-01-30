public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) < r) {
            double v = Math.random();
            if (v < 0.25) x--;
            else if (v < 0.50) x++;
            else if (v < 0.75) y--;
            else if (v < 1.00) y++;
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("Steps = " + steps);
    }
}
