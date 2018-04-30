package com.company;


public class Ak47Strategy implements EnemySlayingStrategy {

  @Override
  public void execute() {
    System.out.println("Вы застрелили противника");
  }
}
