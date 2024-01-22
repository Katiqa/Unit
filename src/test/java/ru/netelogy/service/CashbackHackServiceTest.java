package ru.netelogy.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void ShouldTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);

        assertEquals(999, actual);
    }

    @org.junit.Test
    public void ShouldTest999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);

        assertEquals(1, actual);
    }

    @org.junit.Test
    public void ShouldTest500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);

        assertEquals(500, actual);
    }

    @org.junit.Test
    public void ShouldTest0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);

        assertEquals(actual, 1000);
    }

    @org.junit.Test
    public void ShouldTest1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);

        assertEquals(0, actual);
    }

}
