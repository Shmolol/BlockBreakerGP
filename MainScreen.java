import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends World
{
    private GreenfootSound gameMusic;
    /**
     * Constructor for objects of class MainScreen.
     * 
     */
    public MainScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 510, 1);
        gameMusic = new GreenfootSound("NewRaviPog.mp3");
        started();
        prepare();
    }
    private void prepare()
    {
        Option1 option1_Button = new Option1();
        addObject(option1_Button,270,325);
        Option2 option2_Button = new Option2();
        addObject(option2_Button,270,400);
    }
    public void started(){
        gameMusic.playLoop();
    }
    public void stopped(){
        gameMusic.stop();
    }
}