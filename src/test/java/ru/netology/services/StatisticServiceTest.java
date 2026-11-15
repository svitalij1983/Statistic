package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    @Test
    public void testTotalSale() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.calculateTotalSale(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSale() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.calculateAverageSale(sales);
        long expected = 180 / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaximumSale() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.getMonthMaximumSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMonthMinimumSale() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.getMonthMinimumSale(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testCalculateMonthsBellowAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.calculateMonthsBellowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testCalculateMonthsHigherAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.calculateMonthsHigherAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}