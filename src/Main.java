//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CommunicationDevice zigbeeDevice = new ZigbeeDevice();
        CommunicationDevice bluetoothDevice = new BluetoothDevice();

        Cattle cattle1 = new BeefCattle("123", "Kazan", "Beef", zigbeeDevice, true, true);
        Cattle cattle2 = new DairyCattle("456", "Moscow", "Dairy", bluetoothDevice, false, false);

        cattle1.updateLocation("Krasnodar");
        cattle1.setDevice(bluetoothDevice);
        cattle1.updateLocation("Moscow");

        cattle2.updateLocation("Krasnodar");
        cattle2.setDevice(zigbeeDevice);
        cattle2.updateLocation("Moscow");
    }
}