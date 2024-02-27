import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rick here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rick extends Actor {
    /**
     * Act - do whatever the Rick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private Ability walkAbility = new Walk();
    private Ability shootAbility = new Shoot();
    private Ability lookAbility = new Look();

    public void act() {
        // Add your action code here.
        walkAbility.performAction(this);
        shootAbility.performAction(this);
        lookAbility.performAction(this);
    }
}
