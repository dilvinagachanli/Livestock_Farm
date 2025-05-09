public class VeterinaryVisitor implements CattleVisitor {
    public void visit(DairyCattle cattle) {
        if (!cattle.isVaccinated()) cattle.vaccinate();
    }

    public void visit(BeefCattle cattle) {
        if (!cattle.isVaccinated()) cattle.vaccinate();
    }
}
