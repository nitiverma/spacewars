import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SpaceShip extends Actor
{
    public SpaceShip()
    {
        GreenfootImage image = getImage() ;
        image.scale( 100, 140 ) ; 
        
    }
    
    private boolean spaceDown;
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
        }
        
        if (!spaceDown && Greenfoot.isKeyDown("space"))   
        {  
            Bullet bullet = new Bullet();  
            getWorld().addObject(bullet, getX(), getY());  
            spaceDown=true;  
        }
        
        if(spaceDown && !Greenfoot.isKeyDown("space")) {
            spaceDown=false;
        }
    }    
}
