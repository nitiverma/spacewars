import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Bullet extends Actor
{
    public void act() 
    {  
        setLocation(getX(), getY()-8);
         
        if(atWorldEdge())  
         {  
             getWorld().removeObject(this);  
             return;  
         }
         
        Actor star;
        star = getOneIntersectingObject(Stars.class);

        if (star != null)
        {
            SpaceWars world = (SpaceWars) getWorld();
            world.removeObject(star);
            Explosion explode = new Explosion();
            world.addObject(explode, getX(), getY());
            world.addScore((Stars)star);
            world.removeObject(this);
            Greenfoot.delay(10);
            world.removeObject(explode);
        }
    }
    
    private boolean atWorldEdge()  
    {  
        return (getX()==0 ||  
            getY()==0 ||  
            getX()==getWorld().getWidth()-1 ||  
            getY()==getWorld().getHeight()-1);  
    }
}
