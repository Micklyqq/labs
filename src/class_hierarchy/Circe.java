package class_hierarchy;

public class Circe extends Point {


    private float radius;
    public Circe(float x,float y,String color,float radius){
        super(x,y,color);
       this.radius = radius;
    }

    @Override
    public void draw(){

        System.out.println("Круг: x="+this.x+", y="+this.y + " r= "+this.radius);
    }

}
