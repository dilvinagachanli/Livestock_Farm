//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CommunicationDevice zigbeeDevice = new ZigbeeDevice();
        CommunicationDevice bluetoothDevice = new BluetoothDevice();

        Cattle cattle1 = CattleFactory.getCattle("Beef", "123", "Krasnodar", zigbeeDevice);
        Cattle cattle2 = CattleFactory.getCattle("Dairy", "456", "Moscow", bluetoothDevice);

        cattle1.updateLocation("Krasnodar");
        cattle1.setDevice(bluetoothDevice);
        cattle1.updateLocation("Moscow");

        cattle2.updateLocation("Krasnodar");
        cattle2.setDevice(zigbeeDevice);
        cattle2.updateLocation("Moscow");
    }
}
