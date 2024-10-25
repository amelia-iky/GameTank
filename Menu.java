import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public static GreenfootSound bg = new GreenfootSound ("intro.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */ 
    public Menu()
    {    
        super(800, 465, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act()
    {
        bg.setVolume(80);
        bg.playLoop();
    }
    
    private void prepare()
    {
        Start start = new Start();
        addObject(start,400,400);
        start.setLocation(120,400);

        credit credit = new credit();
        addObject(credit,290,400);
        credit.setLocation(700,400);

        quit quit = new quit();
        addObject(quit,40,40);
    }
}
