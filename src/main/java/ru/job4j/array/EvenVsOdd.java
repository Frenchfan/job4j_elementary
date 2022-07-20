package ru.job4j.array;

/*
Вам даны очки игроков. Игроки разделись таким образом,
что под четными индексами находятся очки первой команды,
под нечетными второй. Ваша задача определить, кто выиграл.
Выигрывает та команда, которая набрала наибольшее число очков.
Если выиграла первая команда, то нужно вернуть 1,
если вторая, то 2, если ничья то 0.
 */
public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int team1Counter = 0, team2Counter = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                team1Counter += players[i];
            } else {
                team2Counter += players[i];
            }
        }
        if (team1Counter > team2Counter) {
            return 1;
        } else if (team1Counter == team2Counter) {
            return 0;
        } else {
            return 2;
        }
    }
}
