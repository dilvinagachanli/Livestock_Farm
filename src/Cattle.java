abstract class Cattle {
    private String id;
    private String location;
    private boolean vaccinated = false;
    private boolean earTag = false;

    public Cattle(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public String getId() { return id; }
    public String getLocation() { return location; }

    public boolean isVaccinated() { return vaccinated; }
    public boolean hasEarTag() { return earTag; }

    public void vaccinate() {
        vaccinated = true;
        System.out.println(getType() + " " + id + " vaccinated.");
    }

    public void applyEarTag() {
        earTag = true;
        System.out.println("Ear tag applied to " + getType() + " " + id);
    }

    abstract String getType();
    public abstract void Accept(CattleVisitor visitor);
}
