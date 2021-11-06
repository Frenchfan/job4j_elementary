package ru.job4j.condition;

public class GameT {
    public static int checkGame(double percent, int prize, int pay) {
        double sumofPrize = percent * prize;
        double netProfit = sumofPrize - pay;
        if (netProfit <= 0) {
            return 0;
        } else {
            return (int) netProfit;
        }

    }
}
