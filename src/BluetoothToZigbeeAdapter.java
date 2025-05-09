public class BluetoothToZigbeeAdapter implements CommunicationDevice {
    private BluetoothDevice bluetoothDevice;

    public BluetoothToZigbeeAdapter(BluetoothDevice device) {
        this.bluetoothDevice = device;
    }

    public void sendLocation(String id, String location) {
        bluetoothDevice.transmit(id, location);
    }
}
