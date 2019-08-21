package ru.nc.pdtb6.sandbox;

public class MyFirstProject {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        Point a = new Point();
        Point b = new Point();
        a.x = 2;
        a.y = 3;
        b.x = 4;
        b.y = 12;
        int k1 = a.x - b.x;
        if (k1 < 0){
            k1 = k1 * (-1);
        }
        int k2 = a.y - b.y;
        if (k2 < 0){
            k2 = k2 * (-1);
        }
        int D = (k1*k1)+(k2*k2);
        double d= Math.sqrt(D);
        System.out.println(d);
    }

    }