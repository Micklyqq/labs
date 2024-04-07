package class_hierarchy;

public class Rectangle extends Point{

    public float w;
    public float h;

    public Rectangle(float x,float y,float w,float h,String color){
        super(x,y,color);
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(){

        System.out.println("Прямоугольник: x="+this.x+", y="+this.y + " w= "+this.w+" h= "+this.h);
    }


}
