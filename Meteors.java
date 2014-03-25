import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Meteors extends Stars implements Element,Add
{
    public Meteors(int score) {
        super(score);
    }

    public int getScore()
    {
        return 20;
    }
    
    public Actor getElement(){
        return this;
    }
}
