abstract class Cattle {

    private String id;
    private String location;
    private boolean vaccinated = false, earTag = false;

    void Accept(CattleVisitor visitor) {
    }

    String getId() {
        return id;
    }

    String getLocation() {
        return location;
    }

    boolean isVaccinated() {
        if (!vaccinated) {
            return false;
        }
        return true;
    }

    boolean hasEarTag() {
        if (!earTag) {
            return false;
        }
        return true;
    }

    void vaccinate() {
        vaccinated = true;
    }

    void applyEarTag() {
        earTag = true;
    }


}
