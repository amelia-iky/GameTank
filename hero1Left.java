import greenfoot.*;
public class hero1Left extends Actor {
    int delay = 0;
    public void act() {
        setLocation(getX(),getY());
        if (Greenfoot.isKeyDown("Left")) {
            setLocation(getX()-2, getY());
        } else if (Greenfoot.isKeyDown("Right")) {
            getWorld().addObject(new hero1(), getX()+2, getY());
            getWorld().removeObject(this);
        } else if (Greenfoot.isKeyDown("Up")) {
           getWorld().addObject(new hero2Left(),getX(),308);
           getWorld().removeObject(this);
        } else if (Greenfoot.isKeyDown("X")) {
            shooting();
        }
    }
    
    private void shooting() {
        delay++;
        if (delay==10) {
            getWorld().addObject(new bulletHeroLeft(),getX()-60,getY()-20);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}