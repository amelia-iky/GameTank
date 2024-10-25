import greenfoot.*;
public class Team extends World {
    public Team() {    
        super(800, 465, 1); 
        prepare();
    }
    
    public void prepare() {
        addObject(new mainMenu(),40,430);
    }
}
