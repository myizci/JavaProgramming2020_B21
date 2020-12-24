package day38_StaticKeyword.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();

        developer1.setInfo("Bektemir", "Full stack Developer", "K-01", "Amazon", 160000, 'M');
        developer2.setInfo("Nikola", "Software Developer", "Y-821", "Windows", 155000, 'M');
        developer3.setInfo("Meredith", "Full stack Developer", "T-234", "Apple", 140000, 'F');
        developer4.setInfo("Ian", "Developer", "L-02", "CVS Pharmacy", 135000, 'M');


        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setInfo("Adnan", "Tester", "0005", "Cybertek", 98000, 'M');
        tester2.setInfo("Dean", "Tester", "0006", "Cybertek", 98500, 'M');
        tester3.setInfo("Jair", "Tester", "0007", "Cybertek", 99000, 'M');

        Tester[] testers = {tester2, tester3};
        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.setInfo("Omer", "Buket", "Halid");
        scrum1.addTester(tester1);
        scrum1.addTester(testers);
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);
        System.out.println("==============================");
        for (Tester each : scrum1.testersTeam) {

            System.out.println(each);
        }
        System.out.println("===============================");
        for (Developer each : scrum1.developersTeam) {
            System.out.println(each);
        }

        System.out.println("========================");

        Tester tester4 = new Tester();
        Tester tester5 = new Tester();
        tester4.setInfo("Asuman", "SDET", "GR-24", "Javaholics", 170000, 'F');
        tester5.setInfo("Ercan", "SDET", "GR-25", "Javaholics", 170000, 'M');


        Developer developer5 = new Developer();
        Developer developer6 = new Developer();

        developer5.setInfo("ALtynai", "Full-Stack Developer", "GR-24", "Javaholics", 180000, 'F');
        developer6.setInfo("Shardae", "Full-Stack Developer", "GR-25", "Javaholics", 170000, 'F');

        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.setInfo("Bayram", "Ali", "Alpaslan");
        scrum2.addTester(tester4);
        scrum2.addTester(tester5);
        scrum2.addDeveloper(developer5);
        scrum2.addDeveloper(developer6);

        System.out.println(scrum2);


        // scrum1.removeDeveloper("K-01");
        System.out.println(scrum1);
        System.out.println("========================");

        ScrumTeam[] scrums = {scrum1, scrum2};

        // print names and salary of every single tester

        for (ScrumTeam eachScrum : scrums) {

            for (Tester eachTester : eachScrum.testersTeam) {

                System.out.println(eachTester.name + " : $" + eachTester.salary);
            }

        }
        System.out.println("==============================");
        for (ScrumTeam eachScrum : scrums) {

            for (Developer eachDeveloper : eachScrum.developersTeam) {

                System.out.println(eachDeveloper.name + " : $" + eachDeveloper.salary);
            }

        }
        System.out.println("===================================");

        int countDevelopers = 0;
        int countTesters = 0;

        for (ScrumTeam each : scrums) {
            countTesters += each.testersTeam.size();
            countDevelopers += each.developersTeam.size();
        }

        System.out.println("Testers: " + countDevelopers);
        System.out.println("Developers: " + countDevelopers);


        System.out.println("=================================");

        System.out.println(scrums[0].SM);
        System.out.println(scrums[1].SM);

        scrums[0].SM = "Ahmet Can";
        scrums[1].SM = "Meryem Gul";

        System.out.println(scrums[0].SM);
        System.out.println(scrums[1].SM);

        System.out.println("==============================");

        ArrayList<ScrumTeam> scrumList = new ArrayList<>();
        scrumList.addAll(Arrays.asList(scrums));
        System.out.println(scrumList);
        System.out.println("==============================================");


        /*
        for(int i=0; i<scrumList.size(); i++){

    ScrumTeam eachTeam =scrumList.get(i);

    for(int j=0; j<eachTeam.testersTeam.size(); j++){

        Tester eachTester =eachTeam.testersTeam.get(j);
        System.out.println(eachTester.name + " : $"+eachTester.salary);
    }
    for(int k=0; k<eachTeam.testersTeam.size(); k++){
       Developer eachDeveloper = eachTeam.developersTeam.get(k);
        System.out.println(eachDeveloper.name + " : $"+eachDeveloper.salary);
    }

}


         */

        for (ScrumTeam eachScrum : scrumList) {
            System.out.println("Testers Lit");
            for (Tester eachTester : eachScrum.testersTeam) {
                System.out.println(eachTester.name + " : $" +eachTester.salary);
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Developers List");
        for(Developer eachDeveloper: eachScrum.developersTeam){
            System.out.println(eachDeveloper.name + " : $" +eachDeveloper.salary);

        }



        }







    }

}
