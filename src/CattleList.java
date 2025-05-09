import java.util.ArrayList;

public class CattleList {
    public void Add(Cattle cattle)
    {   cattles.add(cattle);
    }
    public void Remove(Cattle cattle)
    {   cattles.remove(cattle);}

    public void Accept(CattleVisitor visitor)
    {   for(Cattle cattle : cattles){
        cattle.Accept(visitor);
    }

    }
    private ArrayList<Cattle> cattles = new ArrayList<Cattle>();

}
