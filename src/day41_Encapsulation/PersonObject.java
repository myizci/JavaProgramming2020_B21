package day41_Encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person p1 = new Person("Jimmy",19,'M');

        p1.setAge(34);
        p1.setName("Mahmut");
        //p1.setGender('F');

        System.out.println(p1.getName()  +": "+p1.getAge()+" years old Gender: "+p1.getGender() );

    }
}
