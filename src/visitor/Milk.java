/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author sirik
 */
public class Milk implements Visitable
{
    private int price = 25;

    public int getPrice(){
        System.out.println("Milk 25 Bath.");
        return price;
    }
    
    @Override
    public void accept(Visitor v)
    {
        v.visit(this);
    }
    
}
