import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWon1World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWonWorld1 extends World
{
    
    private GreenfootSound winSound;
    
    /**
     * Constructor for objects of class YouWon1World.
     * 
     */
    public YouWonWorld1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 510, 1);
        winSound = new GreenfootSound("kgm.mp3");
    }
    public void act() {
        if (Greenfoot.isKeyDown("escape")) {
            transitionToMainScreen();
        }
    }
    public void transitionToMainScreen(){
        stopped();
        Greenfoot.stop();
        World MainScreen = new MainScreen();
        Greenfoot.setWorld(MainScreen);
        MainScreen.started();
        Greenfoot.start();
    }
    public void started(){
        winSound.playLoop();
    }
    public void stopped(){
        winSound.stop();
    }
}
