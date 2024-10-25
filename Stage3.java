import greenfoot.*;
public class Stage3 extends World
{
    public static Counter score;
    public static Counter hp;
    
    int timer;
    int timer2;
    boolean condition = true;
    boolean condition2 = true;
    public Stage3(Counter passedScore, Counter passedHp)
    {
        super(800, 465, 1);
        score = passedScore;
        hp = passedHp;
        prepare();
    }
    
    public void act()
    {
        timer--;
        if(condition)
        {
            showText("STAGE 3",400,100);
            timer = 100;
            condition = false;
        }
        else if(timer == 1)
        {
            showText("",400,100);
        }
        else if(Stage1.score.getValue() >50 && Greenfoot.getRandomNumber(300)==1)
        {
            addObject(new enemy3(),800,322);
            addObject(new enemy3Right(),1,322);
        }
        else if(Stage3.score.getValue() >= 110)
        {
            spawnbomber();
        }
        else if(Stage3.score.getValue() >= 500)
        {
            showText("YOU WIN!",400,100);
            Greenfoot.delay(100);
            showText("CONGRATULATIONS",400,100);
            showText("Score : "+Stage1.score.getValue()+" points" ,400,120);
            Greenfoot.delay(350);
            Greenfoot.setWorld(new team());
            
        }
        //gameover
        if(Stage3.hp.getValue()<=0)
        {
            hero1 hero = (hero1) getObjects(hero1.class).get(0);
            if (hero != null)
            {
                removeObject(hero);
            }
            Greenfoot.setWorld(new OverPage());
        }
    }
    
    public void spawnbomber () 
    {
        timer2--;
        if(condition2)
        {
            timer2=100;
            condition2 = false;
        }
        if (timer2 == 1)
        {
            addObject(new enemy4(),1,30);
        }
    }
    
    public void prepare()
    {
        addObject(new hero1(),400,322);
        addObject(new enemy4(),800,30);
        addObject(score,60,25);
        addObject(hp,740,25);
    }
}
