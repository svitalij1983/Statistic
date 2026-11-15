package ru.netology.services;

public class StatisticService {

    public long calculateTotalSale(long[] sales){

        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }
    public long calculateAverageSale(long[] sales){

        return calculateTotalSale(sales)/ sales.length;

    }
    public int getMonthMaximumSale(long[] sales){
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] >= sales[monthMaximum]){
                monthMaximum = i;
            }
        }
        return monthMaximum +1;
    }

    public int getMonthMinimumSale(long[] sales){
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] < sales[monthMinimum]){
                monthMinimum = i;
            }
        }
        return monthMinimum +1;
    }
    public int calculateMonthsBellowAverage(long[] sales){
        int counter = 0;
        long average = calculateAverageSale(sales);
        for (long sale : sales) {
           if(sale < average){
               counter ++;
           }
        }
        return counter;
    }
    public int calculateMonthsHigherAverage(long[] sales){
        int counter = 0;
        long average = calculateAverageSale(sales);
        for (long sale : sales) {
            if(sale > average){
                counter ++;
            }
        }
        return counter;
    }
}
