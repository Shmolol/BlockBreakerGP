import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Option2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Option2 extends Actor
{
    /**
     * Act - do whatever the Option2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseMoved(this))
        {
            setImage("Option2_Button_Highlighted.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Option2_Button.png");
        }

        if (Greenfoot.mouseClicked(this))
        {
            transitionToTutorial();
        }
    }
    public void transitionToTutorial(){
        World currentLevel = getWorld();
        currentLevel.stopped();
        Greenfoot.stop();
        World TutorialWorld = new TutorialWorld();
        Greenfoot.setWorld(TutorialWorld);
        TutorialWorld.started();
        Greenfoot.start();
    }
}
