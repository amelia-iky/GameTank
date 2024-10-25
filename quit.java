import greenfoot.*;
public class quit extends Actor
{
    public void act(){
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Menu());
            Menu.bg.stop();
            start.bgsound.stop();
            Greenfoot.stop();
        }
    }
}