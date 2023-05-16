import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1World extends World
{
    
    private GreenfootSound gameMusic;
    
    /**
     * Constructor for objects of class Level1World.
     * 
     */
    public Level1World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 510, 1); 
        gameMusic = new GreenfootSound("enchanted tiki 86.mp3");
        showText("Lives: ",40, 490);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,280,475);
        Ball ball = new Ball();
        addObject(ball,280,430);
        Brick brick = new Brick();
        addObject(brick,60,30);
        Brick brick3 = new Brick();
        addObject(brick3,60,110);
        Brick brick5 = new Brick();
        addObject(brick5,60,190);
        Brick brick7 = new Brick();
        addObject(brick7,270,30);
        Brick brick9 = new Brick();
        addObject(brick9,480,30);
        PowerUpBlue powerUpBlue = new PowerUpBlue();
        addObject(powerUpBlue,165,110);
        PowerUpBlue powerUpBlue2 = new PowerUpBlue();
        addObject(powerUpBlue2,375,110);
        Brick brick14 = new Brick();
        addObject(brick14,270,110);
        Brick brick15 = new Brick();
        addObject(brick15,480,110);
        Brick brick21 = new Brick();
        addObject(brick21,270,190);
        Brick brick23 = new Brick();
        addObject(brick23,480,190);
    }
    // Music methods
    public void started(){
        gameMusic.playLoop();
    }
    public void stopped(){
        gameMusic.stop();
    }
    
    // Transition methods
    public void act() {
        transitionToWorld2();
    }
    public void transitionToWorld2(){
        if(isGameWon()) {
            stopped();
            Greenfoot.stop();
            World Level2World = new Level2World();
            Greenfoot.setWorld(Level2World);
            Level2World.started();
            Greenfoot.start();
        }
    }
    public boolean isGameWon() {
        if (getObjects(Brick.class).isEmpty() &&
            getObjects(PowerUpBlue.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }    
    }
}