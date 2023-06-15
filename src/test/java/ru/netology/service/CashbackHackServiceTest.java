package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCashbackIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackIfAmount999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackIfAmount1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackIfAmount0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackIfAmount1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1001;
        int actual = service.remain(-1);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackIfAmount50() {
        CashbackHackService service = new CashbackHackService();

        int expected = 950;
        int actual = service.remain(50);

        Assert.assertEquals(actual, expected);
    }
}
