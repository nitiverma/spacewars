import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class end here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terminate extends Actor implements GameState 
{
    SpaceWars world;
    /**
     * Act - do whatever the end wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            world.executeExit();
        }
    }
    public Terminate(SpaceWars world)
    {
        this.world = world;
    }
    public void exit() 
    {

   }
    public void stop(){}
    
    public void run(){
        world.setState(world.getPauseState());
       
    }
}
