public class Farmer implements Observer {
    private LocationDatabase db;

    public Farmer(LocationDatabase db) {
        this.db = db;
    }

    @Override
    public void Update(String id, String location) {
        System.out.println("Notifying farmer: Cattle " + id + " is outside the farm at " + location + "!");
    }
}

