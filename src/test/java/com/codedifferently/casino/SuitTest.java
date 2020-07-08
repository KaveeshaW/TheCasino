package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;

public class SuitTest {

    @Test
    public void HeartsTest() {
        // Given
        Suit k = Suit.HEARTS;

        // When
        String expected = "HEARTS";
        String actual = k.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SpadesTest() {
        // Given
        Suit k = Suit.SPADES;

        // When
        String expected = "SPADES";
        String actual = k.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DiamondsTest() {
        // Given
        Suit k = Suit.DIAMONDS;

        // When
        String expected = "DIAMONDS";
        String actual = k.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ClubsTest() {
        // Given
        Suit k = Suit.CLUBS;

        // When
        String expected = "CLUBS";
        String actual = k.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
