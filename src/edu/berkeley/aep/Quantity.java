package edu.berkeley.aep;

// Understands how to compare measurements in different units
public class Quantity {
    private final int size;
    private final Unit unit;

    @Override
    public String toString() {
        return size + " " + unit;
    }

    public Quantity(int size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Quantity otherQuantity)) return false;
        if (!isComparableTo(otherQuantity)) return false;
        return otherQuantity.unit.convertTo(otherQuantity.size, unit) == size;
    }

    private boolean isComparableTo(Quantity other) {
        return unit.isComparableTo(other.unit);
    }

    public Quantity add(Quantity other) {
        int otherSize = other.unit.convertTo(other.size, unit);
        return new Quantity(size + otherSize, unit);
    }
}
