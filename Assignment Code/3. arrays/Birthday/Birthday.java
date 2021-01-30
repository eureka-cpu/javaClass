public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);    // number of days
        int trialsNum = Integer.parseInt(args[1]); // number of trials
        // total number of people
        int trials = 0; // number of trials run
        int[] room = new int[trialsNum];


        // hasBirthday[d] = true if someone born on day d; false otherwise
        // auto-initialized to false


        while (trials < trialsNum) { // keep run trials until trialsNum
            int people = 0;
            boolean[] hasBirthday = new boolean[n];

            while (true) {
                people++;
                int d = (int) (n * Math.random()); // integer between 0 and days-1
                if (hasBirthday[d])
                    break;    // two people with the same birthday, so break out of loop
                hasBirthday[d] = true;        // update array
            }
            room[trials] = people;
            trials++;
        }
        double fraction = 0; // fraction of times that i or fewer ppl enter room
        int i = 1; // number of people that enter a room before they have same bd
        while (fraction < 0.5) { // limit fraction
            int count = 0; // num of times exactly i ppl enter room
            for (int j = 0; j < room.length; j++) { // go through each room
                if (room[j] == i) {
                    count++;
                }
            }
            fraction += count / (double) trialsNum;
            System.out.println(i + "\t\t" + count + "\t\t" + fraction);
            i++;
        }
    }
}
