package Office_Hours.Practice_12_23_2020;

public class FaceBook {

    public static void main(String[] args) {
        ProductOwner po = new ProductOwner("Natalie", "101", 'F', 120000, true);
        BusinessAnalyst ba = new BusinessAnalyst("Gulistan", "102", 'F', 110000, true);
        ScrumMaster sm = new ScrumMaster("Dragisa", "103", 'M', 105000, true);

        ScrumTeam scrumTeam = new ScrumTeam(po, sm, ba);


        System.out.println(scrumTeam);

        Tester tester1 = new Tester("Halid", "201", 'M', 90000, true);
        Tester[] testers = {new Tester("Nukhet", "202", 'F', 95000, false),
                new Tester("Nimet", "203", 'F', 93000, true)};


        Developer dev1 = new Developer("Salih", "301", 'M', 150000, true);

        Developer[] devs = {new Developer("Omer ", "302", 'M', 190000, true),
                new Developer("Buket", "303", 'F', 200000, true)};


        scrumTeam.addTester(tester1);
        scrumTeam.addTester(testers);
        scrumTeam.addDeveloper(dev1);
        scrumTeam.addDeveloper(devs);

        System.out.println(scrumTeam);

        scrumTeam.removeTester("201");
        System.out.println(scrumTeam);
        scrumTeam.removeDeveloper("301");
        System.out.println(scrumTeam);
        System.out.println("=======================================");

        for(Tester each: testers){

            System.out.println(each.name + " : "+ each.salary);
        }

        System.out.println(scrumTeam.getProductOwner());

        for(Developer each: devs){

            System.out.println(each.name + " : "+ each.salary);
        }



    }
}
