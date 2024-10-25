import greenfoot.*;
public class Stage3 extends World {
    public static counter score;
    public static counter hp;
    
    int timer;
    int timer2;
    boolean condition = true;
    boolean condition2 = true;
    public Stage3(counter passedScore, counter passedHp) {
        super(800, 465, 1);
        score = passedScore;
        hp = passedHp;
        prepare();
    }
    
    public void act() {
        timer--;
        if(condition) {
            showText("STAGE 3",400,100);
            timer = 100;
            condition = false;
        } else if(timer == 1) {
            showText("",400,100);
        }
        
        if(Stage1.score.getValue() >50 && Greenfoot.getRandomNumber(200)==1) {
            addObject(new enemy3(),800,322);
            addObject(new enemy3Right(),-10,322);
        }  else if(Stage3.score.getValue() >= 500) {
            addObject(new gameWin(), 400, 232);
            Greenfoot.delay(350);
            Greenfoot.setWorld(new Team());
        } else if(Stage3.score.getValue() >= 210) {
            spawnbomber();
        }
        
        if(Stage3.hp.getValue() <=0 ) {
            hero1 hero = (hero1) getObjects(hero1.class).get(0);
            if (hero != null) {
                removeObject(hero);
            }
            Greenfoot.setWorld(new OverPage());
        }
    }
    
    public void spawnbomber () {
        timer2--;
        if(condition2) {
            timer2=100;
            condition2 = false;
        } else if (timer2 == 1) {
            addObject(new enemy4(),1,30);
        }
    }
    
    public void prepare() {
        addObject(new hero1(),400,322);
        addObject(new enemy4(),800,30);
        addObject(score,60,25);
        addObject(hp,740,25);
    }
}
