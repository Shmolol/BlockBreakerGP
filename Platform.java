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
    public static int WIDTH = 70;
    public static int HEIGHT = 10;
    
    public void act() {
        if (Greenfoot.isKeyDown("left")) {
            move(-6);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(6);
        }
    }
}
