package com.company.strategies;

public class KarateStrategy implements EnemySlayingStrategy {

    @Override
    public void execute() {
        System.out.println("Вы победили противника в рукопашной схватке");
    }

}
