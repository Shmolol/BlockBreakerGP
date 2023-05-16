import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2World extends World
{

    /**
     * Constructor for objects of class Level2World.
     * 
     */
    public Level2World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 510, 1); 
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
        
        PowerUpBlue powerUpBlue = new PowerUpBlue();
        addObject(powerUpBlue,60,25);
        PowerUpBlue powerUpBlue2 = new PowerUpBlue();
        addObject(powerUpBlue2,475,25);
        Brick brick = new Brick();
        addObject(brick,270,25);
        Brick brick2 = new Brick();
        addObject(brick2,145,80);
        Brick brick3 = new Brick();
        addObject(brick3,390,80);
        Brick brick4 = new Brick();
        addObject(brick4,60,130);
        Brick brick5 = new Brick();
        addObject(brick5,475,130);
        PowerUpBlue powerUpBlue3 = new PowerUpBlue();
        addObject(powerUpBlue3,270,130);
        Brick brick6 = new Brick();
        addObject(brick6,145,185);
        Brick brick7 = new Brick();
        addObject(brick7,390,185);
        Brick brick8 = new Brick();
        addObject(brick8,270,237);
        Brick brick9 = new Brick();
        addObject(brick9,475,240);
        Brick brick10 = new Brick();
        addObject(brick10,60,239);
        Brick brick11 = new Brick();
        addObject(brick11,145,290);
        Brick brick12 = new Brick();
        addObject(brick12,390,290);
        
        
        Brick brick13 = new Brick();
        addObject(brick13,270,290);
        Brick brick14 = new Brick();
        addObject(brick14,270,80);
    }
}
