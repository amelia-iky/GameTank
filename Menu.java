import greenfoot.*;
public class Menu extends World {
    public static GreenfootSound bg = new GreenfootSound ("intro.mp3");
    public Menu(){    
        super(800, 465, 1); 
        prepare();
    }
    
    public void act() {
        bg.setVolume(80);
        bg.playLoop();
    }
    
    private void prepare() {
        start start = new start();
        addObject(start,400,400);
        start.setLocation(120,400);

        credit credit = new credit();
        addObject(credit,290,400);
        credit.setLocation(700,400);

        quit quit = new quit();
        addObject(quit,40,40);
    }
}
