import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plateform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    /**
     * Act - do whatever the Plateform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final int WIDTH = 80;
    public static final int HEIGHT = 10;
    
    public void act() {
    if (Greenfoot.isKeyDown("left")) {
        setLocation(getX() - 5, getY());
    }
    if (Greenfoot.isKeyDown("right")) {
        setLocation(getX() + 5, getY());
    }
}
}
