package org.katas;

/**
 * Created by liyue on 2018/1/13
 */
public abstract class AbstractItem {

  private int sellIn;
  private int quality;
  private String name;

  public AbstractItem(int sellIn, int quality, String name) {
    this.sellIn = sellIn;
    this.quality = quality;
    this.name = name;
  }

  public abstract AbstractItem updateSellInAndQuality();

}
