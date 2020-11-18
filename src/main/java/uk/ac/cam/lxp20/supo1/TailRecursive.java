package uk.ac.cam.lxp20.supo1;

public class TailRecursive {
    static int sumN (int current, int total){
        if (current < 0) {
            return total;
        }
        return sumN((current-1), (total + current));
    }

    public static void main(String[] args) {
        System.out.println(sumN(100000, 0));
    }
}
