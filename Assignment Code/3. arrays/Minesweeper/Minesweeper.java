public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // m.lngth Row
        int n = Integer.parseInt(args[1]); // n.lngth Column
        int minesNum = Integer.parseInt(args[2]); // # of mines
        int[][] grid = new int[m][n]; // slots of 2D array
        int[] indices = new int[m * n]; // slots of 1D array
        int decVal = (m * n); // decreasing num of slots


        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        for (int i = 0; i < minesNum; i++) { // create mines
            int randomIndex = (int) (Math.random() * decVal); // select random slot
            // mineLocation
            int mineLoc = indices[randomIndex]; // assign it to index of 1D array
            grid[mineLoc / n][mineLoc % n] = -1; // convert 1D to 2D array values
            indices[randomIndex] = indices[decVal - 1]; // pick ranindex and replace with last value
            decVal--;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String thingIWantToPrint;
                if (grid[i][j] == -1) {
                    thingIWantToPrint = "*";
                }
                else {
                    if (((-1 < i - 1) && (-1 < j - 1)) && grid[i - 1][j - 1] == -1) {
                        grid[i][j]++;
                    }
                    if ((-1 < i - 1) && grid[i - 1][j] == -1) {
                        grid[i][j]++;
                    }
                    if (((-1 < i - 1) && (j + 1 < n)) && grid[i - 1][j + 1] == -1) {
                        grid[i][j]++;
                    }
                    if ((-1 < j - 1) && grid[i][j - 1] == -1) {
                        grid[i][j]++;
                    }
                    if ((j + 1 < n) && grid[i][j + 1] == -1) {
                        grid[i][j]++;
                    }
                    if (((i + 1 < m) && (-1 < j - 1)) && grid[i + 1][j - 1] == -1) {
                        grid[i][j]++;
                    }
                    if ((i + 1 < m) && grid[i + 1][j] == -1) {
                        grid[i][j]++;
                    }
                    if (((i + 1 < m) && (j + 1 < n)) && grid[i + 1][j + 1] == -1) {
                        grid[i][j]++;
                    }
                    thingIWantToPrint = String.valueOf(grid[i][j]);
                }
                System.out.print(thingIWantToPrint + "  ");
            }
            System.out.println();
        }
    }
}
