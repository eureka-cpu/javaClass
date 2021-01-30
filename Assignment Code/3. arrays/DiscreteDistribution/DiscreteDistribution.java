public class DiscreteDistribution {
  public static void main(String[] args) {

    int m = Integer.parseInt(args[0]);
    int n = args.length;
    int[] a; // declare array
    int[] s;
    a = new int[n - 1]; // create array/ ex. 7 parking spaces, we only want 6, "I need x parking spaces pls"
    s = new int[n];
    s[0] = 0;

    for (int i = 0; i < a.length; i++) {
      a[i] = Integer.parseInt(args[i + 1]);  // accessing the parking spaces
    }

    // actual problem solution begins here
    // add up all the numbers in a,
    int cum = 0;
    for (int i = 0; i < a.length; i++) {
      cum += a[i];
      s[i + 1] = cum;
    }
    // pick random number between 0 & cum
    for (int j = 1; j <= m; j++) {
      int r = 1 + (int) (Math.random() * (cum));
      for (int i = 0; i < s.length; i++) {
        if (s[i] >= r) {
               System.out.print(i + " ");
               break;
        }
      }    
    }
    // determine which category that random number belongs to
    // print out num, repeat m times
  }
}


