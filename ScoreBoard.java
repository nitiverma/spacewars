import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

public class ScoreBoard extends Actor implements Subject
{
    private GreenfootImage board;
    private GreenfootImage sb;
    private int score = 0;
    private String label = "Score Board: ";
    private List<Observer> observers;
    
    public ScoreBoard()
    {
     super();
     
     observers = new ArrayList();
     
     int boardWidth = 200;
     int boardHeight = 30;
     int boardTransparency = 125;
     
     board = new GreenfootImage(boardWidth, boardHeight);
     board.setColor(Color.gray);
     board.setTransparency(boardTransparency);
     board.fillRect(0, 0, boardWidth, boardHeight);
     
     update();
    }
    
    public void act() 
    {
       update(); // Add your action code here.
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void addScore(int pts)
    {
        score += pts;
        update();
        notifyObserver();
    }
    
    private void update()
    {
        sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label + score, 18, Color.WHITE, new Color(0,0,0,0)), 25, 5);
        this.setImage(sb);
    }
    
    public void register(Observer newObserver)
    {
        observers.add(newObserver);
    }
    
    public void unregister(Observer deleteObserver)
    {
        observers.remove(deleteObserver);
    }
    
    public void notifyObserver()
    {
        for (Observer observer : observers) {
            observer.update(score);
        }
    }
}

