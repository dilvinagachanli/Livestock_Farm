public class LocationDatabase {
    private static LocationDatabase instance;

    private LocationDatabase() {}

    public static LocationDatabase getInstance() {
        if (instance == null) {
            instance = new LocationDatabase();
        }
        return instance;
    }

    public void storeLocation(String id, String location) {
        System.out.println("Location stored: " + id + " at " + location);
    }
}
