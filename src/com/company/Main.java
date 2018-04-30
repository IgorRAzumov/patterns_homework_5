package com.company;

import com.company.strategies.Ak47Strategy;
import com.company.strategies.KarateStrategy;
import com.company.strategies.KnifeStrategy;

public class Main {

    public static void main(String[] args) {

        EnemySlayer enemySlayer = new EnemySlayer(new Ak47Strategy());
        enemySlayer.goToBattle();

        enemySlayer.changeStrategy(new KnifeStrategy());
        enemySlayer.goToBattle();

        enemySlayer.changeStrategy(new KarateStrategy());
        enemySlayer.goToBattle();
    }
}
