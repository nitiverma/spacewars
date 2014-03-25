import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Stars implements Element,Add
{
    public Asteroid(int score) {
        super(score);
    }

    public int getScore()
    {
        return 10;
    }
}
