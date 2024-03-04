package edu.berkeley.aep;

public class ScaledQuantity {
    protected final int size;
    protected final Unit unit;

    public ScaledQuantity(int size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return size + " " + unit;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof ScaledQuantity otherQuantity)) return false;
        if (!isComparableTo(otherQuantity)) return false;
        return otherQuantity.unit.convertTo(otherQuantity.size, unit) == size;
    }

    private boolean isComparableTo(ScaledQuantity other) {
        return unit.isComparableTo(other.unit);
    }
}
