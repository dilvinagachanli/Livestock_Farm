public class MinistryVisitor implements CattleVisitor {
    @Override
    public void visit(DairyCattle cattle) {
        if (!cattle.hasEarTag()) {
            System.out.println("⚠️  Cattle with ID " + cattle.getId() + " has no ear tag! Applying one...");
            cattle.applyEarTag();
        } else {
            System.out.println("✔️  Cattle with ID " + cattle.getId() + " already has an ear tag.");
        }
    }

    @Override
    public void visit(BeefCattle cattle) {
        if (!cattle.hasEarTag()) {
            System.out.println("⚠️  Cattle with ID " + cattle.getId() + " has no ear tag! Applying one...");
            cattle.applyEarTag();
        } else {
            System.out.println("✔️  Cattle with ID " + cattle.getId() + " already has an ear tag.");
        }
    }
}

