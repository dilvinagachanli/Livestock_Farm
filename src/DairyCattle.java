public class DairyCattle extends Cattle {
    private String id, location;
    private boolean vaccinated = false, earTag = false;

    public DairyCattle(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public void Accept(CattleVisitor visitor) { visitor.visit(this); }
    public String getId() { return id; }
    public String getLocation() { return location; }
    public boolean isVaccinated() { return vaccinated; }
    public boolean hasEarTag() { return earTag; }

    public void vaccinate() {
        vaccinated = true;
        System.out.println("Dairy cattle " + id + " vaccinated.");
    }

    public void applyEarTag() {
        earTag = true;
        System.out.println("Ear tag applied to dairy cattle " + id);
    }
}
