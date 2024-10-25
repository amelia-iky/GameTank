import greenfoot.*;
public class bulletHeroUpLeft extends Actor
{    
    private int speedX = -4;
    private int speedY = -4;

    public void act() {
        moveDiagonally();
    }

    private void moveDiagonally() {
        setLocation(getX() + speedX, getY() + speedY);
        
        if(isAtEdge()){
            getWorld().removeObject(this); 
        }
        else if(isTouching(bulletEnemy4.class))
        {
            removeTouching(bulletEnemy4.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
}