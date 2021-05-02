package visitor;
public class Customer extends Visitor
{
    private double totalDrinks;
    
    public void visit(Milktea mt)
    {
        int temp = mt.getPrice();
        totalDrinks += temp;
    
    }
    
    public void visit(Milk m)
    {
        int temp = m.getPrice();
        totalDrinks += temp;
    
    }
    
    public void visit(Bubble b)
    {
        int temp = b.addBubble();
        totalDrinks += temp;
    
    }
    
    public double getTotalDrinks() {
    return totalDrinks;
  }
    
}
