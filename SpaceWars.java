import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class SpaceWars extends World 
{
    private int meteorSpawnRate = 50;
    private int meteorSpeed = 1;
    private int delay = 0;
    ScoreBoard scoreboard;
    LevelUpdater levelUpdater;
    public GameState end;
    public GameState current;
    public GameState pause;
    
    
    public GameState getPauseState()
    {
        return pause;
    }
    
    public GameState getEndState()
    {
        return end;
    }
    
    public void setMeteorSpawnRate(int rate) {
        this.meteorSpawnRate = rate;
    }
    
    public void setMeteorSpeed(int speed) {
        this.meteorSpeed = speed;
    }
    
    public SpaceWars()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        scoreboard = new ScoreBoard();
        levelUpdater = new LevelUpdater(this);
        scoreboard.register(levelUpdater);
        setBackground("stars.jpg");
        prepare();
        end = new Terminate(this);
        pause = new Pause(this);
        current = pause;
    }
    
    public void act()
    {
        super.act();
  
        EnemyBuilder enemy = new EnemyBuilder();
        Abstractfactory abc = null;
        if (Greenfoot.getRandomNumber(meteorSpawnRate) == 1) {
            if (Greenfoot.getRandomNumber(2) == 1) {
                abc = new MeteorElementFactory(meteorSpeed);
            } else {
                abc = new AsteroidElementFactory(meteorSpeed);
            }
        }
        if(abc != null) {
            addObject(enemy.buildenemy(abc).getElement(),Greenfoot.getRandomNumber(getWidth()-20)+10, -30);
        }
    }
    
    public void executeStop()
    {
        current.stop();
        
    }
    
    public void executeExit()
    {
        current.exit();
    }
    
    public void setState(GameState state){
        current = state; 
    }
    
    private void prepare()
    {
        SpaceShip spaceship = new SpaceShip();
        addObject(spaceship, 300, 500);

        addObject(scoreboard, 300, 594);
        Terminate terminate = new Terminate(this);
        addObject(terminate, 587, 25);
        Pause pause = new Pause(this);
        addObject(pause, 580, 589);
        pause.setLocation(576, 577);
    }

    public void endGame()
    {
        End go = new End();
        Greenfoot.setWorld(go);
    }

    public void addScore(Stars star)
    {
        MyBaseScore mbc = new MyBaseScore(star);
        scoreboard.addScore(mbc.getScore());
    }
}
