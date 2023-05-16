import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialWorld extends World
{
    
    private GreenfootSound gameMusic;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public TutorialWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 510, 1); 
        showText("Lives: ",40, 490);
        showText("Move with left and right arrow keys", 350,490);
        gameMusic = new GreenfootSound("Acrostics [Finished].mp3");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,275,385);
        platform.setLocation(280,372);
        Ball ball = new Ball(10);
        addObject(ball,284,316);
        ball.setLocation(280,341);
        Brick brick = new Brick();
        addObject(brick,64,29);
        Brick brick2 = new Brick();
        addObject(brick2,176,32);
        Brick brick3 = new Brick();
        addObject(brick3,282,30);
        Brick brick4 = new Brick();
        addObject(brick4,394,35);
        Brick brick5 = new Brick();
        addObject(brick5,514,31);
        Brick brick6 = new Brick();
        addObject(brick6,515,76);
        Brick brick7 = new Brick();
        addObject(brick7,394,79);
        Brick brick8 = new Brick();
        addObject(brick8,281,76);
        Brick brick9 = new Brick();
        addObject(brick9,172,76);
        Brick brick10 = new Brick();
        addObject(brick10,60,76);
        Brick brick11 = new Brick();
        addObject(brick11,57,122);
        Brick brick12 = new Brick();
        addObject(brick12,173,122);
        Brick brick13 = new Brick();
        addObject(brick13,286,123);
        Brick brick14 = new Brick();
        addObject(brick14,403,123);
        Brick brick15 = new Brick();
        addObject(brick15,518,126);
        platform.setLocation(306,536);
        ball.setLocation(279,482);
        ball.setLocation(264,461);
        platform.setLocation(255,479);
        ball.setLocation(271,456);
        ball.setLocation(244,448);
        platform.setLocation(251,497);
        ball.setLocation(248,451);
        ball.setLocation(261,449);
        ball.setLocation(236,454);
        ball.setLocation(244,461);
        platform.setLocation(242,491);
        ball.setLocation(247,456);
        ball.setLocation(240,449);
    }
    public void started(){
        gameMusic.playLoop();
    }
    
    public void stopped(){
        gameMusic.stop();
    }
    public void act() {
        transitionToMainScreen();
    }
    public void transitionToMainScreen(){
        if(isGameWon()) {
            stopped();
            Greenfoot.stop();
            World MainScreen = new MainScreen();
            Greenfoot.setWorld(MainScreen);
            MainScreen.started();
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
