package ConcreteVillagers;

import Interfaces.IVillager;
import Interfaces.IVisitor;

public class ClericVillager implements IVillager {

    private final String[] trade_items = new String[8];
    private final String[] prices = new String[8];
    private String outfit;

    public void setTrade_item(String trade_item, int i) {
        this.trade_items[i] = trade_item;
    }

    public void setPrice(String price, int i) {
        this.prices[i] = price;
    }

    public String[] getTrade_items() {
        return this.trade_items;
    }

    public String[] getPrices() {
        return this.prices;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public String getOutfit() {
        return this.outfit;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
