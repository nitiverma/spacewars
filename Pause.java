import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pause extends Actor implements GameState 
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
            world.executeStop();
        }
    }
    
    public Pause(SpaceWars world)
    {
        this.world = world;
    }
    
    
    public void stop() 
    { 
            world.setState(world.getPauseState());
            Greenfoot.stop();
   } 
    public void exit(){
        world.setState(world.getEndState());
        End eworld = new End();
        Greenfoot.setWorld(eworld);
    }
    
    public void run(){}
    
}
