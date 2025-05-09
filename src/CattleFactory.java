public class CattleFactory {
    public static Cattle createCattle(String type, String id, String location) {
        switch (type.toLowerCase()) {
            case "dairy":
                return new DairyCattle(id, location);
            case "beef":
                return new BeefCattle(id, location);
            default:
                throw new IllegalArgumentException("Unknown cattle type: " + type);
        }
    }
}
