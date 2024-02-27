import greenfoot.*;

/**
 * Write a description of class Look here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Look implements Ability {
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Look
     */
    public void performAction(Rick rick) {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            rick.turnTowards(mouse.getX(), mouse.getY());
        }

    }

}
