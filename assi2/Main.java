
interface iVillagerFactory{
    Villager createVillager();
}

public class Main {
    public static void main(String[] args) {
        iVillagerFactory raider_factory = new RaiderFactory();
        Villager raider_villager = raider_factory.createVillager();
        System.out.println(raider_villager.toString());

        iVillagerFactory military_factory = new MilitaryFactory();
        Villager military_villager = military_factory.createVillager();
        System.out.println(military_villager.toString());
    }
}
