import greenfoot.*;

public class hero2Left extends Actor
{
    int delay = 0;
    public void act()
    {
        setLocation(getX(),getY());
        if(Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-2, getY());
        }
        else if(Greenfoot.isKeyDown("Right"))
        {
            getWorld().addObject(new hero2(), getX()+2, getY());
            getWorld().removeObject(this);
        }
        else if(Greenfoot.isKeyDown("Down"))
        {
            getWorld().addObject(new hero1Left(),getX(),322);
            getWorld().removeObject(this);
        }
        else if(Greenfoot.isKeyDown("X"))
        {
            shootingUp();
        }
    }
    
    private void shootingUp()
    {
        delay++;
        if(delay==10)
        {
            getWorld().addObject(new bulletHeroUpLeft(),getX()-30,getY()-75);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}