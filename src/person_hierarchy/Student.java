package person_hierarchy;

public class Student extends Person{

    protected String university;
    protected String faculty;
    protected String group;

    protected float scholarship;

    public Student(String name,float height,float weight,int age,String nationality,String university,String faculty,String group,float scholarship){
        super(name,height,weight,age,nationality);
        this.university = university;
        this.faculty = faculty;
        this.group = group;
        this.scholarship = scholarship;
    }

    public void StudentInfo(){
        System.out.println("Имя: "+name+ ", Возраст: "+age+", Университет: "+university+", Факультет: "+faculty+" Группа: "+group+" Стипендия: "+scholarship);
    }
}
