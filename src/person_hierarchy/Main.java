package person_hierarchy;



public class Main {

    public static void main(String[] args) {
        Person person = new Person("Oleg",200,200,69,"Австриец");
        person.PersonInfo();

        Student student = new Student("Диана",178,52,18,"Башкирец","VSTU","ФД","ДЗВ-4",0);
        student.StudentInfo();

        Worker worker = new Worker("Демид",180,120,42,"Чеченец","Заводик",200,"Сварщик");
        worker.WorkerInfo();
    }
}
