import greenfoot.*;
public class team extends World {
    public team() {    
        super(800, 465, 1); 
        prepare();
    }
    
    public void prepare()
    {
        mainmenu mainmenu = new mainmenu();
        addObject(mainmenu,40,430);
    }
}
