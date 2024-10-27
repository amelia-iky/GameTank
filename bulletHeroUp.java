import greenfoot.*;
public class bulletHeroUp extends Actor {
    private int speedX = 5;
    private int speedY = -5;

    public void act() {
        moveDiagonally();
    }

    private void moveDiagonally() {
        setLocation(getX()-3 + speedX, getY()+1 + speedY);
        
        if (isAtEdge()){
            getWorld().removeObject(this); 
        }
        
        if (isTouching(bulletEnemy4.class)) {
            removeTouching(bulletEnemy4.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
}