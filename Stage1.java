import greenfoot.*;
public class Stage1 extends World { 
    public static counter score = new counter("SCORE : ");
    public static counter hp = new counter("HP : ");
    
    int delay = 0;
    int timer;
    boolean condition = true;

    public Stage1() {    
        super(800, 465, 1); 
        prepare();
    }
    
    public void act() {    
        timer--;
        if (timer == 1) {
            showText("LETS START!!",400,100);
            Greenfoot.delay(100);
        }
        
        if (new enemy1().getWorld() == null && Greenfoot.getRandomNumber(200)==1) {
            addObject(new enemy1(),800,322);
        }
        
        if (score.getValue()>=50) {
            showText("YOU WIN!",400,100);
            Greenfoot.delay(80);
            showText("NEXT STAGE",400,100);
            Greenfoot.delay(80);
            Greenfoot.setWorld(new Stage2(score, hp));
        }
        
        if (Stage1.hp.getValue() <= 0) { 
            hero1 hero = (hero1) getObjects(hero1.class).get(0);
            if (hero != null) {
                removeObject(hero);
            }

            Greenfoot.setWorld(new OverPage());
        }
    }
    
    private void prepare() { 
        addObject(new hero1(),70,322);
        addObject(new enemy1(),800,322);
        addObject(score,60,25);
        addObject(hp,740,25);
        
        score.setValue(0);
        hp.setValue(5);
    }
}
