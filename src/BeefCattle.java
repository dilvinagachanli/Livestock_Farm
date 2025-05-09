public class BeefCattle extends Cattle {
    public BeefCattle(String id, String location) {
        super(id, location);
    }

    @Override
    public String getType() {
        return "Beef cattle";
    }

    @Override
    public void Accept(CattleVisitor visitor) {
        visitor.visit(this);
    }
}
