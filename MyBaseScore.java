import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyBaseScore implements ScoreCalculate

{
    private Stars star;
    public MyBaseScore(Stars star){
        this.star=star;
    }
    public int getScore(){
        //star.
       // int starscore = star.getScore();
        return (star.getScore()+addScore());
    }
    int addScore(){
        return 5; 
    }
    
}
