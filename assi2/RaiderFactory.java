public class RaiderFactory implements iVillagerFactory {

    @Override
    public Villager createVillager() {
        return new Raider();
    }
}
