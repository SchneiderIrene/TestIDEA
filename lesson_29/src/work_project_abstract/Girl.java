package work_project_abstract;

public class Girl extends Schooler {

    public Girl(String name, String surname, int age, String sex) {
        super(name, surname, age, sex);

    }
    public void work (){
        System.out.println(name + " make soup");
    }
}
