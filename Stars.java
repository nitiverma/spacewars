import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars extends Actor
{
    private int speed;
    
    public Stars(int speed) {
        GreenfootImage image = getImage() ;
        this.speed = speed;
    }
    
    public int getScore() {
        return 0;
    }
    
    /**
     * Act - do whatever the Stars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(3);
        setLocation(getX(), getY()+speed);
        isGround();
    }
    
    public void isGround()
    {
        if(atGround() == true)
        {
            SpaceWars world = (SpaceWars) getWorld();
            world.endGame();
        }
    }
    
    public boolean atGround()
    {
        return (getY() > 578);
    }
    
    public Actor getElement(){
        return this;
    }
}
