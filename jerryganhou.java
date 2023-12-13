import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jerryganhou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jerryganhou extends parque
{
    public int temp4 = 10;
    /**
     * Constructor for objects of class jerryganhou.
     * 
     */
    public jerryganhou()
    {
        removeObjects(getObjects(null)); // Isso remove todos os atores
        
    }
    public void act(){
        temp4--;
        if(Greenfoot.isKeyDown("enter") && (temp4 < 1)){
            setBackground(new GreenfootImage("creditos.png"));
        }
    }
}
    
