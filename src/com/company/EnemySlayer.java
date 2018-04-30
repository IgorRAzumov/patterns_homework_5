package com.company;


public class EnemySlayer {

  private EnemySlayingStrategy strategy;

  public EnemySlayer(EnemySlayingStrategy strategy) {
    this.strategy = strategy;
  }

  public void changeStrategy(EnemySlayingStrategy strategy) {
    this.strategy = strategy;
  }

  public void goToBattle() {
    strategy.execute();
  }
}
