import greenfoot.*;
public class Stage2 extends World {
    public static counter score;
    public static counter hp;
    
    public Stage2(counter passedScore, counter passedHp) {
        super(800, 465, 1);
        score = passedScore;
        hp = passedHp;
        prepare();
    }
    
    int timer;
    boolean condition = true;
    public void act() {
        timer--;
        if(condition) {
            showText("STAGE 2",400,100);
            timer = 100;
            condition = false;
        } else if(timer == 1) {
            showText("",400,100);
        }
        
        if (new enemy2().getWorld() == null && Greenfoot.getRandomNumber(200) == 1) {
            addObject(new enemy2(),800,322);
            addObject(new enemy2Right(),-10,322);
        }
        
        if(score.getValue() >= 200) {
            showText("YOU WIN!",400,100);
            Greenfoot.delay(100);
            showText("NEXT STAGE",400,100);
            Greenfoot.delay(100);
            Greenfoot.setWorld(new Stage3(score, hp));
        }
        
        if(Stage2.hp.getValue() <=0 ) {
            hero1 hero = (hero1) getObjects(hero1.class).get(0);
            if (hero != null)
            {
                removeObject(hero);
            }
            Greenfoot.setWorld(new OverPage());
        }
    }
    
    public void prepare()
    {
        addObject(new hero1(),400,322);
        addObject(new enemy2(),800,322);
        addObject(score,60,25);
        addObject(hp,740,25);
    }
}
