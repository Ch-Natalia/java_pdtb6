package ru.nc.pdtb6.sandbox;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest1 {
    Point a;
    Point b;

    @Test
    public void testArea(){
        make();
        assert a.distance(b) == b.distance(a);
    }

    private void make() {
        a = new Point();
        a.x = 1;
        a.y = 2;
        b = new Point();
        b.x = 7;
        b.y = 5;
    }
}