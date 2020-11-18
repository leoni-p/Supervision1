package uk.ac.cam.lxp20.supo1;

public class lowestCommon {

    static int lowestCommon (Long a, Long b) {
        int i;;
        for (i=0; i < 64; i++) {
            if (((a & 1L<<i) != 0L) && ((b & 1L<<i) != 0L)) {
                break;
            }
        }
        if (i == 64) {
            return -1;
        }
        return i;
    }

    public static void main(String[] args) {
        Long a = Long.decode(args[0]);
        Long b = Long.decode(args[1]);
        System.out.print(lowestCommon(a,b));
    }

}
