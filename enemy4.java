import greenfoot.*;
public class enemy4 extends Actor {
    int delay = 0;
    public void act() {
        setLocation(getX()-2,getY());        
        if (getY() == -10) {
            setLocation(getX()+2,getY());
        }
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
            return;
        } else {
            bombing();
        }
        
        if (isTouching(bulletHeroUp.class) || isTouching(bulletHeroUpLeft.class)) {
            removeTouching(bulletHeroUp.class);
            removeTouching(bulletHeroUpLeft.class);
                if (Stage1.score != null) {
                    Stage1.score.add(+10);
                }

                if (Stage2.score != null) {
                    Stage2.score.add(+10);
                }

                if (Stage3.score != null) {
                    Stage3.score.add(+10);
                }

            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
    
    public void bombing() {
        delay++;
        if (delay==100) {
            getWorld().addObject(new bulletEnemy4(),getX(),getY()+50);
            delay=0;
            Greenfoot.playSound("missile.mp3");
        }
    }
}
