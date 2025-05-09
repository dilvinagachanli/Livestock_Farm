public class Main {
    public static void main(String[] args) {
        // Create cattle using Factory Method
        Cattle dairy = CattleFactory.createCattle("dairy", "D001", "North Field");
        Cattle beef = CattleFactory.createCattle("beef", "B001", "South Field");

        CattleList cattleList = new CattleList();
        cattleList.Add(dairy);
        cattleList.Add(beef);



        // Visitor Pattern for the vet and ministry visits and checks
        CattleVisitor vet = new VeterinaryVisitor();
        CattleVisitor ministry = new MinistryVisitor();
        cattleList.Accept(vet);
        cattleList.Accept(ministry);



        // Adapter Pattern to use for some of the cattle's that have bluetooth devices. we needed a converter
        CommunicationDevice zigbee = new ZigbeeDevice();
        CommunicationDevice adaptedBluetooth = new BluetoothToZigbeeAdapter(new BluetoothDevice());
        zigbee.sendLocation(dairy.getId(), dairy.getLocation());
        adaptedBluetooth.sendLocation(beef.getId(), beef.getLocation());

        // Singleton Pattern
        LocationDatabase db = LocationDatabase.getInstance();
        db.storeLocation(dairy.getId(), dairy.getLocation());
        db.storeLocation(beef.getId(), beef.getLocation());

        // Abstract Factory Pattern (Feeding)
        FeedFactory dairyFeedFactory = new DairyFeedFactory();
        FeedFactory beefFeedFactory = new BeefFeedFactory();

        System.out.println("\nDairy Cattle Feed:");
        dairyFeedFactory.createCarbohydrate().describe();
        dairyFeedFactory.createProtein().describe();

        System.out.println("\nBeef Cattle Feed:");
        beefFeedFactory.createCarbohydrate().describe();
        beefFeedFactory.createProtein().describe();
    }
}
