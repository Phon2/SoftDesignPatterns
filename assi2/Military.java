public class Military extends Villager {
    public Military(){
        this.job = "Military";
        this.reputation = 50;
        this.position = new Pos(10,10,0);
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
        return "Military position: " + this.getPosition().toString() + " job: " + this.getJob() + " reputation: " + this.getReputation();
    }
}
