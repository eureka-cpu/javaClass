public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // num of den
        int r = Integer.parseInt(args[1]); // raise to the pow of
        double h = 0; // harmonic number
        for (int den = 1; den <= n; den++) {
            h += (1 / Math.pow(den, r)); // solve for h
        }
        System.out.println(h);
    }
}
