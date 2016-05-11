import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hombre extends Jugador
{
    private int pasos=0;
    
    private GreenfootImage ImgDer;
    private GreenfootImage ImgIzq;
    private GreenfootImage ImgUp;
    private GreenfootImage ImgDown;
    
    public Hombre()
    {
        ImgDer= new GreenfootImage("MaleRight1.png");
        ImgIzq= new GreenfootImage("MaleLeft1.png");
        ImgUp= new GreenfootImage("MaleUp1.png");
        ImgDown= new GreenfootImage("MaleDown1.png");
    }
    
    public void act()
    {
        mueve();
    }
    
    public void mueve()
    {
        int x=getX();
        int y=getY(); 
        
        if( Greenfoot.isKeyDown("left") )//Izquierda
        {
            setLocation(x-1,y);
            wait(5);
            move(-10);
            if(getImage()==ImgIzq)
            setImage(ImgIzq);
            
            //walkLeft(pasos);            
        }
        if( Greenfoot.isKeyDown("right") )//Derecha
        {
            setLocation(x+1,y);
            wait(5);
            move(10);
           // walkRight(pasos);            
        }
        if( Greenfoot.isKeyDown("up") )//Arriba
        {
            setLocation(x,y-10);
            wait(5);
            
           // walkUp(pasos);
        }
        if( Greenfoot.isKeyDown("down") )//Abajo
        {
            setLocation(x,y+10);
            wait(5);
            
           // walkDown(pasos);
        }    
        
        /*int y=getY();
        mueveder();
        muveizq();
        
        if(Greenfoot.isKeyDown("up"))
        y--;
        
        if(Greenfoot.isKeyDown("down"))
        y++;
        setLocation(getX(),y);*/
    }
    
    public void mueveder()
    {
        if(Greenfoot.isKeyDown("right"))
        move(1);
    }
    
    public void muveizq()
    {
        if(Greenfoot.isKeyDown("left"))
        move(-1);
    }
}