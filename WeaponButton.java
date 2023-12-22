import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeaponButton extends Counter
{
    /**
     * Act - do whatever the WpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Counter counter;
    int weaponUpgrade = 1;
    public WeaponButton(Counter counter)
    {
        this.counter = counter;
        setImage(new GreenfootImage("Upgrade \n Senjata", 25, Color.WHITE, new Color(0,0,0,0)));
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this) && counter.money > 149)
        {
            counter.money -= 150;
            weaponUpgrade++;
        }
        if(weaponUpgrade>3)
        weaponUpgrade=3;
    }
}
