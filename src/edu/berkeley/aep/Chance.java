package edu.berkeley.aep;

// Understands the likelihood of something happening
public class Chance {
    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Chance otherChance)) return false;
        return Double.compare(probability, otherChance.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(probability);
    }

    public Chance not() {
        return new Chance(1 - probability);
    }

    public Chance and(Chance other) {
        return new Chance(probability * other.probability);
    }

    // De Morgan's Law
    public Chance or(Chance other) {
        return not().and(other.not()).not();
    }

    @Override
    public String toString() {
        return "Chance: " + probability;
    }

}
