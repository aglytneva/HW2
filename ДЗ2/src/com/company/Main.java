package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println ("   Задание 1.");
        int b = -127;
        short c = 129;
        long d = 2222222;
        float e = 3.56f;
    System.out.println("Переменная b = "+ b + ", а переменная е = " + e +".");
    System.out.println ("");
        System.out.println ("   Задание 2.");
        float WeightBoxer1 = 78.2f;
        float WeightBoxer2 = 82.7f;
        float TotalWeight = WeightBoxer1+WeightBoxer2;
        float WeightDifference = WeightBoxer2 % WeightBoxer1;
        System.out.println("Общий вес боксеров "+ TotalWeight +" кг, а разница между весами боксеров " + WeightDifference + " кг.");
    System.out.println ("");
    System.out.println ("   Задание 3.");
        short bananQuantity = 5;
        short bananWeight = 80;
        int bananTotalWeight = bananWeight * bananQuantity;
        short milkVolume = 200;
        int milkWeight100 = 105;
        int milkTotalWeight = milkWeight100 * milkVolume /100;
        int icecrQuantity = 2;
        int icecrWeight= 100;
        int icecrTotalWeight = icecrWeight * icecrQuantity;
        int eggsQuantity = 4;
        int eggWeight=70;
        int eggdTotalWeight = eggWeight * eggsQuantity;
        int totalWeightGramm = bananTotalWeight+milkTotalWeight+icecrTotalWeight+eggdTotalWeight;
        float totalWeightKg = totalWeightGramm/1000f;
        System.out.println("Для того, чтобы приготовить "+totalWeightKg + " кг спорт-завтрака, нужно смешать в блендере "
                +bananTotalWeight+" грамм бананов, "
                +milkTotalWeight+ " грамм молока, "
                + icecrTotalWeight+" грамм мороженного и "
                +eggdTotalWeight+ " грамм яиц.");
    System.out.println ("");
    System.out.println ("   Задание 4.");
        int lossWeightKg = 7;
        int gInKg = 1000;
        int lossWeightG = lossWeightKg * gInKg;
        int v1 = 250;
        int v2 = 500;
        int daysV1 = lossWeightG / v1;
        int daysV2 = lossWeightG / v2;
        float avarageDays = lossWeightG/((v2+v1)/2f);
    System.out.println("Спорстмен сможет скинуть "+ lossWeightKg + " кг за "+ daysV1 + " дней(я), если в день будет сбрасывать по " + v1 + " грамм," +
            " и за "+daysV2+" дней(я), если в день будет сбрасывать по "+ v2 + " грамм.");
        System.out.println ("В среднем он сможет сбросить нужный вес за "+ avarageDays +" дней(я).");
    System.out.println ("");
    System.out.println ("   Задание 5.");

    int MashaPresentSalaryMonth = 67760;
    int DenPresentSalaryMonth = 83690;
    int KrisPresentSalaryMonth = 76230;
    int monthInYear = 12;
    int percentOfGrowth= 10;
        int MashaFutureSalaryMonth = MashaPresentSalaryMonth*(100+percentOfGrowth)/100;
        int DenFutureSalaryMonth = DenPresentSalaryMonth*(100+percentOfGrowth)/100;
        int KrisFutureSalaryMonth = KrisPresentSalaryMonth*(100+percentOfGrowth)/100;

        int MashaYearDifference = (MashaFutureSalaryMonth-MashaPresentSalaryMonth) * monthInYear;
        int DenYearDifference = (DenFutureSalaryMonth - DenPresentSalaryMonth) * monthInYear;
        int KrisYearDifference = (KrisFutureSalaryMonth - KrisPresentSalaryMonth) * monthInYear;
    System.out.println ("Маша теперь получает "+ MashaFutureSalaryMonth +" рублей. Годовой доход вырос на "+MashaYearDifference+" рублей.");
    System.out.println ("Денис теперь получает "+ DenFutureSalaryMonth +" рублей. Годовой доход вырос на "+DenYearDifference+" рублей.");
    System.out.println ("Кристина теперь получает "+ KrisFutureSalaryMonth +" рублей. Годовой доход вырос на "+KrisYearDifference+" рублей.");
    }
}
