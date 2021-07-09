package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void getSumOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   //sales - название массива
        long expected = 180;

        long actual = service.getSumOfAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void getAvgSumOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   //sales - название массива
        double expected = 15;

        double actual = service.getAvgSumOfSales(sales);
        assertEquals(expected, actual);
    }
}