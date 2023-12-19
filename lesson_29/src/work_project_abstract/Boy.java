package work_project_abstract;

public class Boy extends Schooler{

    public Boy(String name, String surname, int age, String sex) {
        super(name, surname, age, sex);

    }

    public void work (){
        System.out.println(name + " make stool");
    }
}
