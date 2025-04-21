public class CattleFactory {
    public static Cattle getCattle(String type, String id, String location, CommunicationDevice communicationDevice){
        if (type.equals("Beef")){
            return new BeefCattle(id, location, type, communicationDevice, true, true);
        }else if (type.equals("Dairy")){
            return new DairyCattle(id, location, type, communicationDevice, false, false);
        }else{
            throw new IllegalArgumentException("Invalid cattle type");
        }

    }}


