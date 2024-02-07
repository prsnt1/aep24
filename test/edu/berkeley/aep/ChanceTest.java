package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {
    @Test
    public void twoCoinTossChancesShouldBeEqualToEachOther() {
        var coinToss = new Chance(0.5);
        var anotherCoinToss = new Chance(0.5);
        assertEquals(coinToss, anotherCoinToss);
    }

    @Test
    public void complementOfDieThrowShouldBeOneMinusProbability() {
        var dieThrow = new Chance(1/4f);
        assertEquals(new Chance(3/4f), dieThrow.not());
    }

    @Test
    public void probabilityOfTwoCoinTossesBothBeingHeadsShouldBeOneQuarter() {
        Chance coinToss = new Chance(0.5);
        Chance probabilityOfTwoHeads = new Chance(0.25);
        assertEquals(probabilityOfTwoHeads, coinToss.and(coinToss));
    }

    @Test
    public void probabilityOfTwoCoinTossesYieldingAtLeastOneHeadShouldBeThreeQuarters() {
        Chance coinToss = new Chance(0.5);
        Chance probabilityOfAtLeastOneHead = new Chance(0.75);
        assertEquals(probabilityOfAtLeastOneHead, coinToss.or(coinToss));
    }
}
