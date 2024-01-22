package ru.netelogy.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void ShouldTest1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);

        assertEquals(actual, 0);
    }

    @org.testng.annotations.Test
    public void ShouldTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);

        assertEquals(actual, 999);
    }

    @org.testng.annotations.Test
    public void ShouldTest999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);

        assertEquals(actual, 1);
    }

    @org.testng.annotations.Test
    public void ShouldTest500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);

        assertEquals(actual, 500);
    }

    @org.testng.annotations.Test
    public void ShouldTest0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);

        assertEquals(actual, 1000);
    }

}
