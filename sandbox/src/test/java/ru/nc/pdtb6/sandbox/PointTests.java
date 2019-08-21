package ru.nc.pdtb6.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    Point a;
    Point b;

    @Test
    public void testArea() {
        make();
        Assert.assertNotEquals(a.distance(b), b.distance(a), "The points have a different distance!");
    }

    @Test
    public void testArea2() {
        make();
        Assert.assertEquals(a.distance(b), b.distance(a), "The points have a different distance!");
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
