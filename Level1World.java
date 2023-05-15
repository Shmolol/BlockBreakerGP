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
        Brick brick2 = new Brick();
        addObject(brick2,60,70);
        Brick brick3 = new Brick();
        addObject(brick3,60,110);
        Brick brick4 = new Brick();
        addObject(brick4,60,150);
        Brick brick5 = new Brick();
        addObject(brick5,60,190);
        Brick brick6 = new Brick();
        addObject(brick6,165,30);
        Brick brick7 = new Brick();
        addObject(brick7,270,30);
        Brick brick8 = new Brick();
        addObject(brick8,375,30);
        Brick brick9 = new Brick();
        addObject(brick9,480,30);
        PowerUpBlue powerUpBlue = new PowerUpBlue();
        addObject(powerUpBlue,165,110);
        PowerUpBlue powerUpBlue2 = new PowerUpBlue();
        addObject(powerUpBlue2,375,110);
        Brick brick10 = new Brick();
        addObject(brick10,165,70);
        Brick brick11 = new Brick();
        addObject(brick11,270,70);
        Brick brick12 = new Brick();
        addObject(brick12,375,70);
        Brick brick13 = new Brick();
        addObject(brick13,480,70);
        Brick brick14 = new Brick();
        addObject(brick14,270,110);
        Brick brick15 = new Brick();
        addObject(brick15,480,110);
        Brick brick16 = new Brick();
        addObject(brick16,165,150);
        Brick brick17 = new Brick();
        addObject(brick17,270,150);
        Brick brick18 = new Brick();
        addObject(brick18,375,150);
        Brick brick19 = new Brick();
        addObject(brick19,480,150);
        Brick brick20 = new Brick();
        addObject(brick20,165,190);
        Brick brick21 = new Brick();
        addObject(brick21,270,190);
        Brick brick22 = new Brick();
        addObject(brick22,375,190);
        Brick brick23 = new Brick();
        addObject(brick23,480,190);
    }
    public void started(){
        gameMusic.playLoop();
    }
    
    public void stopped(){
        gameMusic.stop();
    }
}