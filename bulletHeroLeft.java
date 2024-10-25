import greenfoot.*;
public class bulletHeroLeft extends Actor
{
    public void act()
    {
        setLocation(getX()-5,getY());
        if(isAtEdge())
            getWorld().removeObject(this); 
        else if(isTouching(bulletEnemy.class))
        {
            removeTouching(bulletEnemy.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
}
