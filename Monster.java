import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 2;
    Player player;
    Counter counter;
    public Monster(Player mainPlayer,Counter counter)
    {
        this.counter = counter;
        player = mainPlayer;
        setImage("spiky-monster.png");
        getImage().scale(50,50);
    }
    public void act()
    {
        moveAround();
        hitByProjectile();
    }
    public void moveAround()
    {
        move(1);
        turnTowards(player.getX(), player.getY());
    }
    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            health--;
            getWorld().removeObject(projectile);
        }
        if(health == 0)
        {
            counter.score++;
            counter.money+=5;
            getWorld().removeObject(this);
        }   
    }
}
