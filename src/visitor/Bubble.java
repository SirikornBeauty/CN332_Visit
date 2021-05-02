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
public class Bubble implements Visitable
{
    private int price = 5;

    
    public int addBubble(){
        System.out.println("Add bubble 5 Bath");
        return price;
    }
    
    @Override
    public void accept(Visitor v)
    {
        v.visit(this);
    }
    
}
