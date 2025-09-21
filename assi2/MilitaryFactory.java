public class MilitaryFactory implements iVillagerFactory {
    @Override
    public Villager createVillager() {
        return new Military();
    }
}
