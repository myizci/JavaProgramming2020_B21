package day44_Inheritance.Practice;

public class Practice1  {

   private String name; // you cannot access them
   private int age;

    public Practice1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Practice1(){

    }

    public Practice1(int age){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Practice1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
