package uk.ac.cam.lxp20.supo3;

public class Point implements Comparable<Point>{
    private int x;
    private int y;
    private int z;

    Point(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int compareTo(Point p) {
        if (x != p.x) {
            return x - p.x;
        }
        if (y != p.y) {
            return y - p.y;
        }
        return z - p.z;
    }

    @Override
    public boolean equals(Object o){
        Point other = (Point) o;
        return (other.x == x) && (other.y == y) && (other.z == z);
    }

    int getX() {return x;}
    int getY() {return y;}
    int getZ() {return z;}

    public static void main(String[] args) {
        Point p1 = new Point(1,2,3);
        Point p2 = new Point(1,2,3);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.equals(p2));
    }



}
