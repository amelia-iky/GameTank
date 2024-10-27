import greenfoot.*;
public class hero2 extends Actor {
    int delay = 0;
    public void act() {
        setLocation(getX(),getY());
        if (Greenfoot.isKeyDown("Left")) {
            getWorld().addObject(new hero2Left(), getX()-2, getY());
            getWorld().removeObject(this);
        } else if(Greenfoot.isKeyDown("Right")) {
            setLocation(getX()+2, getY());
        } else if (Greenfoot.isKeyDown("Down")) {
            getWorld().addObject(new hero1(),getX(),322);
            getWorld().removeObject(this);
        } else if (Greenfoot.isKeyDown("X")) {
            shootingUp();
        }
    }
    
    private void shootingUp() {
        delay++;
        if (delay==10) {
            getWorld().addObject(new bulletHeroUp(),getX()+30,getY()-75);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}