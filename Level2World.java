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
        addObject(platform,262,465);
        Ball ball = new Ball();
        addObject(ball,267,420);
        ball.setLocation(263,432);
        PowerUpBlue powerUpBlue = new PowerUpBlue();
        addObject(powerUpBlue,54,25);
        PowerUpBlue powerUpBlue2 = new PowerUpBlue();
        addObject(powerUpBlue2,474,25);
        Brick brick = new Brick();
        addObject(brick,251,27);
        Brick brick2 = new Brick();
        addObject(brick2,145,80);
        Brick brick3 = new Brick();
        addObject(brick3,356,81);
        Brick brick4 = new Brick();
        addObject(brick4,52,130);
        Brick brick5 = new Brick();
        addObject(brick5,467,129);
        PowerUpBlue powerUpBlue3 = new PowerUpBlue();
        addObject(powerUpBlue3,249,133);
        Brick brick6 = new Brick();
        addObject(brick6,144,185);
        Brick brick7 = new Brick();
        addObject(brick7,364,188);
        Brick brick8 = new Brick();
        addObject(brick8,256,237);
        Brick brick9 = new Brick();
        addObject(brick9,465,240);
        Brick brick10 = new Brick();
        addObject(brick10,51,239);
        Brick brick11 = new Brick();
        addObject(brick11,147,286);
        Brick brick12 = new Brick();
        addObject(brick12,366,288);
        brick6.setLocation(163,190);
        brick2.setLocation(151,86);
        Brick brick13 = new Brick();
        addObject(brick13,254,288);
        Brick brick14 = new Brick();
        addObject(brick14,250,80);
        brick3.setLocation(368,80);
        brick14.setLocation(256,79);
        powerUpBlue3.setLocation(268,124);
        powerUpBlue3.setLocation(247,130);
        powerUpBlue3.setLocation(258,130);
        brick6.setLocation(120,191);
        brick6.setLocation(151,191);
        brick2.setLocation(139,69);
        brick.setLocation(271,32);
        brick.setLocation(243,23);
        brick.setLocation(261,29);
        brick6.setLocation(139,192);
        brick2.setLocation(170,74);
        brick.setLocation(253,34);
        brick2.setLocation(163,80);
        brick6.setLocation(159,186);
        brick2.setLocation(153,67);
        brick2.setLocation(130,84);
        brick6.setLocation(130,178);
        brick11.setLocation(110,278);
        brick11.setLocation(159,288);
        brick11.setLocation(131,291);
        brick13.setLocation(251,291);
        brick12.setLocation(391,292);
        brick13.setLocation(267,289);
        brick12.setLocation(339,287);
        brick7.setLocation(368,193);
        brick9.setLocation(474,239);
        brick5.setLocation(464,132);
        brick12.setLocation(390,289);
        brick13.setLocation(254,292);
        brick12.setLocation(355,294);
        brick12.setLocation(362,292);
        brick12.setLocation(371,291);
        powerUpBlue3.setLocation(229,137);
        powerUpBlue3.setLocation(248,130);
        brick14.setLocation(241,79);
        brick.setLocation(245,35);
        brick14.setLocation(261,74);
        brick.setLocation(258,35);
        powerUpBlue3.setLocation(266,133);
        powerUpBlue3.setLocation(241,120);
        brick14.setLocation(240,74);
        brick.setLocation(240,36);
        powerUpBlue3.setLocation(259,129);
        brick14.setLocation(266,79);
        brick.setLocation(263,29);
        brick14.setLocation(241,76);
        brick.setLocation(251,23);
        brick14.setLocation(253,78);
        powerUpBlue3.setLocation(249,131);
    }
}
