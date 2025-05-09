public class MinistryVisitor implements CattleVisitor {
    public void visit(DairyCattle cattle) {
        if (!cattle.hasEarTag()) cattle.applyEarTag();
    }

    public void visit(BeefCattle cattle) {
        if (!cattle.hasEarTag()) cattle.applyEarTag();
    }
}
