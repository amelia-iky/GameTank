import greenfoot.*;
public class bulletEnemyRight extends Actor {
    public void act() {
        setLocation(getX()+5,getY());
        if(isAtEdge()) {
            getWorld().removeObject(this);
        } else if(isTouching(bulletHeroLeft.class) || isTouching(bulletHeroUp.class)) {
            removeTouching(bulletHeroLeft.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
        } else if(isTouching(hero1.class) || isTouching(hero1Left.class) || isTouching(hero2.class) || isTouching(hero2Left.class)) {
            if (Stage1.hp != null) {
                Stage1.hp.add(-1);
               } else if (Stage2.hp != null) {
                Stage2.hp.add(-1);
            } else if (Stage3.hp != null) {
                Stage3.hp.add(-1);
            }
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
        }
    }
}
