import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Option1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Option1 extends Actor
{
    /**
     * Act - do whatever the Option1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseMoved(this)){
            setImage("Option1_Button_Highlighted.png");
        }
        if(Greenfoot.mouseMoved(getWorld())){
            setImage("Option_Button.png");
        }
        if(Greenfoot.mouseClicked(this)){
            Display display = new Display();
            getWorld().addObject(display, 280, 500);
            display.setImage(new GreenfootImage("You have selected Play", 35, Color.WHITE, Color.BLACK, Color.YELLOW));
        }
    }
}
