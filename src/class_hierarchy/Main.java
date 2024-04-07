package class_hierarchy;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(3.0f,4.0f,"Yellow");
        point.draw();
        point.move(2.0f,3.0f);
        point.draw();

        Circe circe = new Circe(3.0f,3.0f,"Yellow",3.0f);
        circe.draw();

        Rectangle rectangle = new Rectangle(3.0f,3.0f,100.0f,100.0f,"Brown");
        rectangle.draw();

        Ellipse ellipse = new Ellipse(3.0f,3.0f,100.0f,100.0f,"Green");
        ellipse.draw();

        Background background = new Background("White");
        background.draw();
    }
}
