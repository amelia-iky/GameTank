import greenfoot.*;
public class Start extends Actor {
    public static GreenfootSound bgsound = new GreenfootSound ("bgsound.mp3");
    public void act() {
        if(Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        } else if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Stage1());
            Menu.bg.stop();
            bgsound.setVolume(80);
            bgsound.playLoop();            
        }
    }
   
}
