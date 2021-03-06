import java.awt.*;
import java.util.*;

class Cell extends Rectangle {
    // fields
    static int size = 35;
    int visc;
    boolean colored = false;
    String str;
    Color color;
    
    //constructors
    public Cell(int x, int y){
        super(x,y,size,size);

    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(color);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
        
    }

    public boolean contains(Point p){
        if (p != null){
            return super.contains(p);
        } else {
            return false;
        }
    }
    public void col(){
        this.colored = true;
    }
}