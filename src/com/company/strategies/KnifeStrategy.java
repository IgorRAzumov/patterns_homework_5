package com.company.strategies;

public class KnifeStrategy implements EnemySlayingStrategy {
  @Override
  public void execute() {
    System.out.println("Вы убили противника попаданием ножа");
  }
}
