import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWon1World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    double timeWelcomeScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class YouWon1World.
     * 
     */
    public SplashScreen()
    {    
        super(540, 510, 1); 
    }
    
    public void act()
    {
       Display display = new Display();
        addObject(display , 280, 500);
        
        int timerValue = (int) (System.currentTimeMillis() 
                                    - timeWelcomeScreenCreation)/1000;
       if (Greenfoot.isKeyDown("space")|| System.currentTimeMillis() 
                >= (timeWelcomeScreenCreation + (5 * 1000)))
        {
            Greenfoot.setWorld(new MainScreen());
            Greenfoot.start();
        }
    }
}
