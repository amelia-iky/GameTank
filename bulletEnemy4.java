import greenfoot.*;
public class bulletEnemy4 extends Actor {
    public void act() {
        setLocation(getX(),getY()+1);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        
        if (isTouching(bulletHero.class) || isTouching(bulletHeroLeft.class)|| (isTouching(bulletHeroUp.class))) {
            removeTouching(bulletHero.class);
            removeTouching(bulletHeroLeft.class);
            removeTouching(bulletHeroUp.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
            return;
        }
        
        if (isTouching(hero1.class) || isTouching(hero1Left.class) || isTouching(hero2.class) || isTouching(hero2Left.class)) {
            if (Stage1.hp != null) {
                Stage1.hp.add(-1);
            }
            
            if (Stage2.hp != null) {
                Stage2.hp.add(-1);
            }
            
            if (Stage3.hp != null) {
                Stage3.hp.add(-1);
            }
            
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
        }
    }
}
