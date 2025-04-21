interface  CommunicationDevice{
    void sendLocation(String id, String location);
}
 class ZigbeeDevice implements CommunicationDevice{
    @Override
    public void sendLocation(String id, String location) {
        System.out.println("Sending location to " + id + ": " + location);
    }
}
class BluetoothDevice implements CommunicationDevice{
    @Override
    public void sendLocation(String id, String location) {
        System.out.println("Sending location to " + id + ": " + location);

    }
}

