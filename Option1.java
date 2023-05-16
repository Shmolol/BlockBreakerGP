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
            setImage("Option1_Button.png");
        }
        if(Greenfoot.mouseClicked(this)){
            transitionToWorld1();
        }
    }
    public void transitionToWorld1(){
        World currentLevel = getWorld();
        currentLevel.stopped();
        Greenfoot.stop();
        World Level1World = new Level1World();
        Greenfoot.setWorld(Level1World);
        Level1World.started();
        Greenfoot.start();
    }
}
