package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackerTest {

    @Test
    void shouldCalculateRemain() {
        int amount = 1000;
        int expected = 1000;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemain2() {
        int amount = 69;
        int expected = 931;

        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}