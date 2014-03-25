import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeteorElementFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeteorElementFactory extends Actor implements Abstractfactory
{
    private int speed;
    
    public MeteorElementFactory(int speed) {
        this.speed = speed;
    }
    /**
     * Act - do whatever the MeteorElementFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
       public Element createElement(){
           Meteors meteor = new Meteors(speed);
           return meteor;
          
    }    }
