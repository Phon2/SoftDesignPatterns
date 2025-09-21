public class Raider extends Villager{
    public Raider(){
        this.job = "Raider";
        this.reputation = -50;
        this.position = new Pos(-50,-50,0);
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setPosition(Pos position) {
        this.position = position;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public Pos getPosition() {
        return position;
    }

    public String getJob() {
        return job;
    }

    public int getReputation() {
        return reputation;
    }

    @Override
    public String toString() {
        return "Raider position: " + this.getPosition().toString() + " job: " + this.getJob() + " reputation: " + this.getReputation();
    }
}
