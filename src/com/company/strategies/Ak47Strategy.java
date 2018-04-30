package com.company.strategies;

public class Ak47Strategy implements EnemySlayingStrategy {

  @Override
  public void execute() {
    System.out.println("Вы застрелили противника");
  }
}
