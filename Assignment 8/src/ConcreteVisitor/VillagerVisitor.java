package ConcreteVisitor;

import ConcreteVillagers.*;
import Interfaces.IVisitor;

public class VillagerVisitor implements IVisitor {
    @Override
    public void visit(ButcherVillager butcherVillager) {
        butcherVillager.setOutfit("red headband and white apron");
        butcherVillager.setTrade_item("Rabbit Stew",1);
        butcherVillager.setPrice("1 iron",1);
        butcherVillager.setTrade_item("16 cooked beef",2);
        butcherVillager.setPrice("2 emeralds",2);
    }

    @Override
    public void visit(ClericVillager clericVillager) {
        clericVillager.setOutfit("purple apron and dark cloak");
        clericVillager.setTrade_item("Holy Water",1);
        clericVillager.setPrice("7 emeralds",1);
        clericVillager.setTrade_item("Enchanting Book",2);
        clericVillager.setPrice("9 emeralds",2);
    }

    @Override
    public void visit(ToolsmithVillager toolsmithVillager) {
        toolsmithVillager.setOutfit("black apron");
        toolsmithVillager.setTrade_item("Iron Pickaxe",1);
        toolsmithVillager.setPrice("1 emerald",1);
        toolsmithVillager.setTrade_item("Axe Repair Kit",2);
        toolsmithVillager.setPrice("9 iron",2);
    }
}
