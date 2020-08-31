package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumAll() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSumAll(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSumSales() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        float expected = 15.0F;
        float actual = service.calculateAverageSumSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxMonth (){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findMaxMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinMonth (){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findMinMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountLowerMonthes (){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.countOfLowerMonthes(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountHigherMonthes (){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.countOfHigherMonthes(purchases);
        assertEquals(expected, actual);
    }
}
