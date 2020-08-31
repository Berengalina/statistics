package ru.netology.stats;

public class StatsService {

    public int calculateSumAll(int[] purchases) {     //1. Сумма всех продаж
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public float calculateAverageSumSales (int[] purchases){     //2. Средняя сумма продаж в месяц
        float sum = calculateSumAll (purchases);
        return  sum/purchases.length;
    }

   public int findMaxMonth (int[] purchases) {                 // 3. Номер месяца, в котором был пик продаж
        int max = purchases[0];
        int indexForMax = 0;
        for (int i = 0; i < purchases.length; i++) {
            int score = purchases[i];
            if (max <= score) {
                max = score;
                indexForMax=i;
            }
        }
        return indexForMax+1;
    }

    public int findMinMonth (int[] purchases) {                // 4. Номер месяца, в котором был минимум продаж
        int min = purchases[0];
        int indexForMin = 0;
        for (int i = 0; i < purchases.length; i++) {
            int score = purchases[i];
            if (min >= score) {
                min = score;
                indexForMin=i;
            }
        }
        return indexForMin+1;
    }


    public int countOfLowerMonthes (int[] purchases) {         //5. Кол-во месяцев, в которых продажи были ниже среднего
        float sum =  calculateAverageSumSales (purchases);
        int index = 0;
        for (int i = 0; i < purchases.length; i++) {
            int score = purchases[i];
            if (sum > score) {
                index++;
            }
        }
        return  index;
    }


    public int countOfHigherMonthes (int[] purchases) {         // 6. Кол-во месяцев, в которых продажи были выше среднего
        float sum =  calculateAverageSumSales (purchases);
        int index = 0;
        for (int i = 0; i < purchases.length; i++) {
            int score = purchases[i];
            if (sum < score) {
                index++;
            }
        }
        return  index;
    }

}

