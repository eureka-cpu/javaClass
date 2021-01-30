public class ThueMorse {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        boolean[] a;
        a = new boolean[n];
        a[0] = false;
        for (int i = 1; i < a.length; i *= 2) {
            for (int j = 0; j < i && j + i < n; j++) {
                a[i + j] = !a[j];
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String thingIWantToPrint;
                if (a[i] == a[j]) {
                    thingIWantToPrint = "+";
                }
                else {
                    thingIWantToPrint = "-";
                }
                System.out.print(thingIWantToPrint + "  ");
            }
            System.out.println();
        }
    }
}


