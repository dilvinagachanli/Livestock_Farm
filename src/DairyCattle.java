public class DairyCattle extends Cattle {
    public DairyCattle(String id, String location) {
        super(id, location);
    }

    @Override
    public String getType() {
        return "Dairy cattle";
    }

    @Override
    public void Accept(CattleVisitor visitor) {
        visitor.visit(this);
    }
}
