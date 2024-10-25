import greenfoot.*;
public class enemy4 extends Actor
{
    int delay = 0;
    public void act()
    {
        setLocation(getX()-2,getY());        
        if (getY()==-10)
        {
            setLocation(getX()+2,getY());
        }
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else 
        {
            bombing();
        }
    }
    public void bombing()
    {
        delay++;
        if(delay==100)
        {
        getWorld().addObject(new bulletEnemy4(),getX(),getY()+50);
        delay=0;
        Greenfoot.playSound("missile.mp3");
        }
    }
}
