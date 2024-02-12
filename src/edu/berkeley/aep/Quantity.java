package edu.berkeley.aep;

// Understands how to compare measurements in a given unit
public class Quantity {
    private final int size;
    private final Unit unit;

    public Quantity(int size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Quantity otherQuantity)) return false;
        return otherQuantity.unit.convertTo(this.unit, otherQuantity.size) == size;
    }

    @Override
    public int hashCode() {
        return unit.hashCode(size);
    }

    @Override
    public String toString() {
        return size + " " + unit;
    }
}
