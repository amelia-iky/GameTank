import greenfoot.*;
public class blast extends Actor {
    int delay = 0;
    public void act() {
        delay++;
        if (delay==50) {
            getWorld().removeObject(this);
        }
    }
}
