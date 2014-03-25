import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelUpdater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelUpdater implements Observer
{
    SpaceWars spaceWars;
    
    public LevelUpdater(SpaceWars spaceWars) {
        this.spaceWars = spaceWars;
    }
    
    public void update(int score)
    {
        int level = score / 600;
        if (level > 10) {
            level = 10;
        }
        setLevel(level);
    }
    
    public void setLevel(int level)
    {
        spaceWars.setMeteorSpawnRate(50 - (5 * level));
        spaceWars.setMeteorSpeed(1 + (level / 3));
    }
}
