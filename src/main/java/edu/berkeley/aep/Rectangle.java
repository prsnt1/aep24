package edu.berkeley.aep;

// Understands a four-sided figure with sides at right angles
public class Rectangle {

    private final int length;
    private final int width;

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public static Rectangle createRectangle(int length, int width) {
        return new Rectangle(length, width);
    }

    private Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return width * length;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(length) << 32 + Integer.hashCode(width);
    }
}
