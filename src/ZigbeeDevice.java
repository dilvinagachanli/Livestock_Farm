public class ZigbeeDevice implements CommunicationDevice {
    public void sendLocation(String id, String location) {
        System.out.println("Zigbee sending: " + id + " at " + location);
    }
}
