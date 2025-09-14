
interface VillagerBuilder{
    VillagerBuilder setPos(Pos inp);
    VillagerBuilder setJob(String inp);
    VillagerBuilder setReputation(int inp);
    Villager build();
}

public class Main {
    public static void main(String[] args) {
        VillagerBuilder builder = new FirstVillagerBuilder();
        Villager vill1= builder.setPos(new Pos(1,0,5)).setJob("Clerk").setReputation(15).build();
        System.out.println(vill1.toString());
    }
}

class FirstVillagerBuilder implements VillagerBuilder{
    private Villager villager = new Villager();
    @Override
    public VillagerBuilder setPos(Pos inp) {
        this.villager.setPosition(inp);
        return this;
    }
    @Override
    public VillagerBuilder setJob(String inp) {
        this.villager.setJob(inp);
        return this;
    }
    @Override
    public VillagerBuilder setReputation(int inp) {
        this.villager.setReputation(inp);
        return this;
    }

    @Override
    public Villager build() {
        return this.villager;
    }
}