package com.company;

public class KnifeStrategy implements EnemySlayingStrategy {
  @Override
  public void execute() {
    System.out.println("Вы убили противника попаданием ножа");
  }
}
