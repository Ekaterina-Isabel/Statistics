package ru.netology.stats;

import java.lang.reflect.Array;

public class StatsService {

    public long getSumOfAllSales(long[] sales) {   //Сумма всех продаж //название массива sales
        long sum = 0;
        for (long sale : sales) {   //цикл
            sum += sale;
        }
        return sum;
    }

    public double getAvgSumOfSales(long[] sales) {   //Средняя сумма продаж в месяц
        long sum = getSumOfAllSales(sales);
        int length = sales.length;

        return sum/length;
    }
}
