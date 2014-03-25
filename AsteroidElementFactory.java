import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AsteroidElementFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsteroidElementFactory extends Actor implements Abstractfactory
{
    private int speed;
    
    public AsteroidElementFactory(int speed) {
        this.speed = speed;
    }
    
    /**
     * Act - do whatever the AsteroidElementFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public Element createElement(){
           Asteroid asteroid = new Asteroid(speed);
           return asteroid;
          
    }
}
