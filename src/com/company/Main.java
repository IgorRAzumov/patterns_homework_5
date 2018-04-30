package com.company;

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
