import ConcreteVillagers.ButcherVillager;
import ConcreteVillagers.ClericVillager;
import ConcreteVillagers.ToolsmithVillager;
import ConcreteVisitor.VillagerVisitor;
import Interfaces.IVillager;
import Interfaces.IVisitor;

public class Main {
    public static void main(String[] args) {

        IVisitor visitor = new VillagerVisitor();

        ClericVillager clericVillager = new ClericVillager();
        ButcherVillager butcherVillager = new ButcherVillager();
        ToolsmithVillager toolsmithVillager = new ToolsmithVillager();

        clericVillager.accept(visitor);
        butcherVillager.accept(visitor);
        toolsmithVillager.accept(visitor);

        printVillagerInfo(clericVillager.getOutfit(), clericVillager.getPrices(), clericVillager.getTrade_items());
        printVillagerInfo(butcherVillager.getOutfit(), butcherVillager.getPrices(), butcherVillager.getTrade_items());
        printVillagerInfo(toolsmithVillager.getOutfit(), toolsmithVillager.getPrices(), toolsmithVillager.getTrade_items());




    }


    static void printVillagerInfo(String outfit, String[] prices, String[] trade_items) {
        System.out.println("Villager in " + outfit + " has this trades:");
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != null) {
                System.out.println(prices[i] + " --> " + trade_items[i]);
            }
        }
        System.out.println("---------------------------------------");
    }


}