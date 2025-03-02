import greenfoot.*;
public class enemy3 extends Actor {
    int delay = 0; 
    public void act() {        
        setLocation(getX()-1,getY());        
        if (getX()==0) {
            setLocation(getX()+1,getY());
        } 
        
        if (isTouching(bulletHero.class)) {
            removeTouching(bulletHero.class);
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
        } else if (isTouching(hero1.class) || isTouching(hero1Left.class) || isTouching(hero2.class) || isTouching(hero2Left.class)) {
            removeTouching(hero1.class);
            removeTouching(hero1Left.class);
            removeTouching(hero2.class);
            removeTouching(hero2Left.class);
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.setWorld(new OverPage());
        }
        
        if (Greenfoot.getRandomNumber(2) <= 1) {
            shooting();
        }
    }
    
    public void shooting() {
        delay++;
        if (delay==130) {
            getWorld().addObject(new bulletEnemy(),getX()-70,getY()-25);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}
