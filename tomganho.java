import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tomganho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tomganho extends parque
{
    public int temp5= 10;
    /**
     * Constructor for objects of class tomganho.
     * 
     */
    public tomganho()
    {
    removeObjects(getObjects(null)); // Isso remove todos os atores   
        // Agora, você pode adicionar qualquer coisa que queira no novo mundo
        // Adicione aqui o código para adicionar atores ou qualquer outra coisa ao novo mundo.
    }
    public void act(){
    temp5--;
    if(Greenfoot.isKeyDown("enter") && (temp5 < 1)){
    setBackground(new GreenfootImage("creditos.png"));
    }
    }
}