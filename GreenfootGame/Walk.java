import greenfoot.*;
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Walk implements Ability 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Walk
     */
    public void performAction(Rick rick)
    {
        if (Greenfoot.isKeyDown("a")){
            rick.setLocation(rick.getX()-6,rick.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            rick.setLocation(rick.getX()+6,rick.getY());
        }
        
        if (Greenfoot.isKeyDown("w")){
            rick.setLocation(rick.getX(),rick.getY()-6);
        }
        if (Greenfoot.isKeyDown("s")){
            rick.setLocation(rick.getX(),rick.getY()+6);
        }    
        
    }

   
}
