package visitor;
/**
 * Write a description of class VisitorFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VisitorFactory
{
    public static Visitor getCustomer(){
        return new Customer();
    }
}
