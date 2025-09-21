public abstract class Villager {
    Pos position;
    String job;
    int reputation;

    @Override
    public String toString() {
        return "Villager position: " + this.position.toString() + " job: " + this.job + " reputation: " + this.reputation;
    }

}

