public class Villager {
    private Pos position;
    private String job;
    private int reputation;

    public Villager(){

    }

    public Pos getPosition() {
        return position;
    }

    public void setPosition(Pos position) {
        this.position = position;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    @Override
    public String toString() {
        return "Villager position: " + this.position.toString() + " job: " + this.job + " reputation: " + this.reputation;
    }

}
