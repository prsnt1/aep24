package edu.berkeley.aep;

// Understands how to convert between different measurement scales
public enum Unit {
    INCHES(1, UnitType.LENGTH),
    FEET(12, UnitType.LENGTH),
    YARDS(36, UnitType.LENGTH),
    MILES(36*1760, UnitType.LENGTH),
    CUP(48, UnitType.VOLUME),
    OZ(6, UnitType.VOLUME),
    TBSP(3, UnitType.VOLUME),
    TSP(1, UnitType.VOLUME);
    private final int inBaseUnits;
    private final UnitType type;

    public boolean isComparableTo(Unit other) {
        return type == other.type;
    }

    private enum UnitType { LENGTH, VOLUME }

    Unit(int inBaseUnits, UnitType type) {
        this.inBaseUnits = inBaseUnits;
        this.type = type;
    }

    public int convertTo(int size, Unit unit) {
        if (type != unit.type) {
            throw new RuntimeException("Tried to convert between units of different types");
        }
        return size * inBaseUnits / unit.inBaseUnits;
    }
}
