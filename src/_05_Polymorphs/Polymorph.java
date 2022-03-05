package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    protected static int width = 100;
    protected static int height = 100;
    
    public Polymorph(int x, int y){
     
   	 this.x = x;
   	 this.y = y;
    }
    
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
