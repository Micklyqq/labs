package class_hierarchy;
public class Point extends Graph {



    public Point(float x,float y,String color){
        this.moveTo(x,y);
        this.color = color;
    }
    public void draw(){

        System.out.println("Точка: x="+this.x+", y="+this.y);
    }

    protected float x;
    protected float y;

    protected String color;

    public void moveTo(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void move(float dx,float dy){
        this.x+=dx;
        this.y+=dy;
    }
}
