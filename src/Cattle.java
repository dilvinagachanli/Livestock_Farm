abstract class Cattle {
    protected String id;
    protected String location;
    protected String type;
    protected CommunicationDevice communicationDevice;
    protected boolean hasEarTag= false;
    protected boolean isVaccinated = false;

    public Cattle(String id, String location, String type, CommunicationDevice communicationDevice, boolean hasEarTag, boolean isVaccinated) {
        this.id = id;
        this.location = location;
        this.type = type;
        this.communicationDevice = communicationDevice;
        this.hasEarTag = hasEarTag;
        this.isVaccinated = isVaccinated;
    }
    public void updateLocation(String newLocation){
        this.location = newLocation;
        communicationDevice.sendLocation(id, location);
    }
    public void setDevice(CommunicationDevice device){
        this.communicationDevice = device;


    }
    public abstract String getFeedingPlan();
}
class DairyCattle extends Cattle{
    public DairyCattle(String id, String location, String type, CommunicationDevice communicationDevice, boolean hasEarTag, boolean isVaccinated) {
        super(id, location, type, communicationDevice, hasEarTag, isVaccinated);
    }
    @Override
    public String getFeedingPlan() {
        return "Feeding plan for Dairy Cattle";
    }
}
class BeefCattle extends Cattle{
    public BeefCattle(String id, String location, String type, CommunicationDevice communicationDevice, boolean hasEarTag, boolean isVaccinated) {
        super(id, location, type, communicationDevice, hasEarTag, isVaccinated);
    }
    @Override
    public String getFeedingPlan() {
        return "Feeding plan for Beef Cattle";
    }
}


