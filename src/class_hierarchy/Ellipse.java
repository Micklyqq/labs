package class_hierarchy;

public class Ellipse extends Rectangle{

    private float a;
    private float b;

    public Ellipse(float x,float y,float w,float h,String color){
        super(x,y,w,h,color);

        this.a = w/2;
        this.b = h/2;
    }

    @Override
    public void draw() {
        float h = x + a;
        float k = y + b;
        System.out.println("Уравнение эллипса: ((x - " + h + ")^2 / " + a*a + ") + ((y - " + k + ")^2 / " + b*b + ") = 1");
    }
}
