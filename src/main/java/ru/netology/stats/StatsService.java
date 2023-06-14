package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long averageSale = sum(sales) / sales.length;
        return averageSale;
    }

    public int monthMaxSale(long[] sales) {
        int monthMaxSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }
    public int monthMinSale(long[] sales) {
        int monthMinSale = 0;

        for (int i = 0; i > sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }
    public int salesBelowAverage(long[] sales){
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }
    public int salesAboveAverage(long[] sales){
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
