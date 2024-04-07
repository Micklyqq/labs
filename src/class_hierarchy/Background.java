package class_hierarchy;

public class Background extends Graph{

    private String color;

    public Background(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Цвет фона: "+color);
    }
}
