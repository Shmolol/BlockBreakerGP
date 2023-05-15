import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends Actor
{
    /**
     * Act - do whatever the Brick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    if (getOneIntersectingObject(Ball.class) != null) {
        getWorld().removeObject(this);
    }
    if (Brick.class == null) {
        //Greenfoot.transitionToWorld(new YouWon1World());
    }

}
    }

