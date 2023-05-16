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

            Display display = new Display();
            getWorld().addObject(display , 280, 500);
            display.setImage(new GreenfootImage("You have selected Tutorial ", 35, Color.WHITE, Color.BLACK, Color.YELLOW));
        }
    }
}
