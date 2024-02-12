package edu.berkeley.aep;

// Understands how to convert between different measurement scales
public enum Unit {
    FEET(12),
    INCHES(1),
    YARDS(36),
    MILES(1760 * 36);

    private final int inBaseUnits;

    Unit(int inBaseUnits) {
        this.inBaseUnits = inBaseUnits;
    }

    public int convertTo(Unit unit, int size) {
        return size * inBaseUnits / unit.inBaseUnits;
    }

    public int hashCode(int size) {
        return Integer.hashCode(inBaseUnits * size);
    }
}
