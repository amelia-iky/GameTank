import greenfoot.*;
public class OverPage extends World {
    public static counter score = new counter("SCORE : ");
    public OverPage() {
        super(800, 465, 1);
        prepare();
    }
    
    public void prepare() {
        gameOver gameOver = new gameOver();
        addObject (gameOver, 100, 100);
        gameOver.setLocation(400,200);
        showText("you lose :(",400,300);
        showText("Score : " +Stage1.score.getValue()+" points" ,400,350);

        mainMenu mainmenu = new mainMenu();
        addObject(mainmenu,40,430);
        
        quit quit = new quit();
        addObject(quit,750,430);
    }
}
