import greenfoot.*;
import java.math.*;
public class Bullet extends Actor
{
    private int rotation;

    public Bullet (int rotation) {
        this.rotation = rotation;
    
        }   
    public void act() {
      movement();
      move(10);
      bulletRemove();
    }
    public void movement(){
  
        setRotation(rotation);
    
    } 
    public void bulletRemove() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        
    }
    
}
