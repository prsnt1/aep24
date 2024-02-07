package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void rectangleWithSideFourShouldHaveAreaSixteen() {
        var rectangle = Rectangle.createRectangle(4, 4);
        assertEquals(16, rectangle.area());
    }

    @Test
    public void rectangleWithSidesFourAndTwoShouldHaveAreaEight() {
        var rectangle = Rectangle.createRectangle(4, 2);
        assertEquals(8, rectangle.area());
    }

    @Test
    public void squareOfSideFiveShouldHaveArea25() {
        var square = Rectangle.createSquare(5);
        assertEquals(25, square.area());
    }
}
