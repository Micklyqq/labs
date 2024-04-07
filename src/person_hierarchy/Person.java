package person_hierarchy;

public class Person {

    protected String name;
    protected float height;
    protected float weight;

    protected int age;

    protected String nationality;

    public Person(String name,float height,float weight,int age,String nationality){
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.nationality = nationality;
        this.name = name;
    }

    public void PersonInfo(){
        System.out.println("Имя: "+name+ ", Возраст: "+age+ ", Рост: "+height+ ", Вес: "+weight+", Национальность: "+nationality);
    }
}
