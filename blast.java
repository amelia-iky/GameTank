import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blast extends Actor
{
    /**
     * Act - do whatever the blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    public void act()
    {
        // Add your action code here.
        delay++;
        if(delay==50)
            getWorld().removeObject(this);
    }
}
