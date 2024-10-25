import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class team extends World
{

    /**
     * Constructor for objects of class team.
     * 
     */
    public team()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 465, 1); 
        prepare();
    }
    //menambahkan tools mainmenu untuk kembali ke halaman sebelumnya
    public void prepare()
    {
        //
        mainmenu mainmenu = new mainmenu();
        addObject(mainmenu,40,430);
    }
}
