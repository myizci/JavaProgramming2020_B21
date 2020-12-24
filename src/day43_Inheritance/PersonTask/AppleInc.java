package day43_Inheritance.PersonTask;

public class AppleInc {

    public static void main(String[] args) {

        Tester t1 = new Tester("Halid",15,'M',75,"QA","123");
        Tester t2 = new Tester("Nukhet",12,'F',85,"QA","124");
        Tester t3 = new Tester("Nimet",9,'F',95,"QA","125");
        Tester t4 = new Tester("Salih",4,'M',80,"QA","126");
        Tester t5 = new Tester("Buket",39,'F',90,"QA","127");

        Developer d1 = new Developer("Ali",40,'M',100,"Dev","221");

        t1.eat();
        t2.sleep();
        t3.work();

        System.out.println("Salary for "+t4.name+" "+t4.calcSalary());

        System.out.println(t5);

    }
}
