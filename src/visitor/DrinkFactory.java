
/**
 * Write a description of class FamilyFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package visitor;
public class DrinkFactory
{
    public static Milktea getMilktea(){
        return new Milktea();
    }
    
    public static Milk getMilk(){
        return new Milk();
    }
    
    public static Bubble getBubble(){
        return new Bubble();
    }
}
