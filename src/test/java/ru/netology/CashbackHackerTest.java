package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {

    @Test
    public void shouldCalculateRemainThousands() {
        int amount = 1000;
        int expected = 0;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemain() {
        int amount = 69;
        int expected = 931;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainZero() {
        int amount = 0;
        int expected = 0;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}