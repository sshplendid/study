package me.sshplendid.tdd.dollar;

public class Dollar {

  public int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  void times(int multiplier) {
    amount *= multiplier;
  }

}
