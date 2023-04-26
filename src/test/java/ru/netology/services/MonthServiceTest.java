package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthServiceTest {
    @Test
    public void testMonthCase1 (){
        MonthService monthService = new MonthService();

        int actual = monthService.calcilate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthCase2 (){
        MonthService monthService = new MonthService();

        int actual = monthService.calcilate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
