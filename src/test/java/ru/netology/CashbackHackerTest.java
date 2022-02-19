package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackerTest {

    @Test
    void shouldCalculateRemainThousands() {
        int amount = 1000;
        int expected = 0;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemain() {
        int amount = 69;
        int expected = 931;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainZero() {
        int amount = 0;
        int expected = 0;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}