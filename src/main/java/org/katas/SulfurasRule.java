package org.katas;

/**
 * Created by liyue on 2018/1/13
 */
public class SulfurasRule implements IRule {
  public Item update(String name, int sellIn, int quality) {
    return Item.newInstanceWithNameSellInAndQuality(name, sellIn - 1, quality);
  }
}
