package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {
    @Test
    public void twelveInchesShouldEqualOneFoot() {
        Quantity twelveInches = new Quantity(12, Unit.INCHES);
        Quantity oneFoot = new Quantity(1, Unit.FEET);
        assertEquals(twelveInches, oneFoot);
    }

    @Test
    public void threeFeetShouldEqualOneYard() {
        Quantity oneYard = new Quantity(1, Unit.YARDS);
        Quantity threeFeet = new Quantity(3, Unit.FEET);
        assertEquals(oneYard, threeFeet);
    }

    @Test
    public void oneMileShouldEqual1760Feet() {
        Quantity oneMile = new Quantity(1, Unit.MILES);
        Quantity oneMileInYards = new Quantity(1760, Unit.YARDS);
        assertEquals(oneMile, oneMileInYards);
    }
}
