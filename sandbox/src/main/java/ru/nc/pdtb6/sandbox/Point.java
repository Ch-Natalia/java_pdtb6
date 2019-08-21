package ru.nc.pdtb6.sandbox;

public class Point {

    int x;
    int y;

    public double distance(Point b) {
        int k1 = this.x - b.x;
        if (k1 < 0){
            k1 = k1 * (-1);
        }
        int k2 = this.y - b.y;
        if (k2 < 0){
            k2 = k2 * (-1);
        }
        int D = (k1*k1)+(k2*k2);
        double d= Math.sqrt(D);
        return d;
    }
}
