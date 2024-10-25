import greenfoot.*;
public class bulletEnemy4 extends Actor {
    public void act() {
        setLocation(getX(),getY()+1);
        if(isAtEdge()) {
            getWorld().removeObject(this);
        } else if(isTouching(bulletHero.class) || isTouching(bulletHeroLeft.class)|| (isTouching(bulletHeroUp.class))) {
            removeTouching(bulletHero.class);
            removeTouching(bulletHeroLeft.class);
            removeTouching(bulletHeroUp.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
}
