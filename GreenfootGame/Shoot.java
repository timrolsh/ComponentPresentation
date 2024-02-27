import greenfoot.*;

/**
 * Write a description of class Shoot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class Shoot implements Ability {
    // instance variables - replace the example below with your own

    public int timer = 0;

    /**
     * Constructor for objects of class Shoot
     */
    public void performAction(Rick rick) {

        if (Greenfoot.isKeyDown("space") && timer >= 25) {
            Bullet bullet = new Bullet(rick.getRotation());
            rick.getWorld().addObject(bullet, rick.getX(), rick.getY() - 5);
            timer = 0;
        }
        timer++;
    }

}
