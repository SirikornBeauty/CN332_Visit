package visitor;
public class Milktea implements Visitable
{
    private int price = 30;

    public int getPrice(){
        System.out.println("Milktea 30 Bath.");
        return price;
    }
    
    @Override
    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
