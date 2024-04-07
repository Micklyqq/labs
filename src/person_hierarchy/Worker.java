package person_hierarchy;

public class Worker extends Person{

    protected String workplace;
    protected float salary;

    protected String workPosition;



    public Worker(String name,float height,float weight,int age,String nationality,String workplace,float salary,String workPosition){
        super(name,height,weight,age,nationality);
        this.workplace = workplace;
        this.salary = salary;
        this.workPosition = workPosition;
    }

    public void WorkerInfo(){
        System.out.println("Имя: "+name+ ", Возраст: "+age+", Место работы: "+workplace+", Зарплата: "+salary+" Должность: "+workPosition);
    }
}
