import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score;
    int money;
    int time;
    public Counter()
    {
        setImage(new GreenfootImage("Skor: " + score + "\n Uang: " + money + "\n Waktu: " + time/60, 40, Color.WHITE, new Color(0,0,0,0)));
    }
    public void act()
    {
        time++;
        setImage(new GreenfootImage("Skor: " + score + "\n Uang: " + money + "\n Waktu: " + time/60, 40, Color.WHITE, new Color(0,0,0,0)));
        // Add your action code here.
    }
}
