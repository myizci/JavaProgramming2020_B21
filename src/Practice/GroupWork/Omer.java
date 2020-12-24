package Practice.GroupWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Omer { //Omer has na offer

    public static void main(String[] args) {
        ArrayList<Offer> offers = new ArrayList<>();

        offers.addAll(Arrays.asList(new Offer(), new Offer(), new Offer(), new Offer(), new Offer()));

        offers.get(0).setInfo("CA",120000,"SDET",true,true,true,true,"GreenIT");
        offers.get(1).setInfo("CA",220000,"QA",true,false,true,false,"BlueIT");
        offers.get(2).setInfo("VA",180000,"Developer",false,true,false,true,"RedIT");
        offers.get(3).setInfo("VA",150000,"BA",false,false,true,true,"DarkIT");
        offers.get(4).setInfo("GA",140000,"SDET",true,true,false,false,"BrightIT");


//
//        for(int i=0; i<offers.size();i++){
//           offers.get(i).getInfo();
//        }

        System.out.println("==========================================");

      // print offers from VA only

      for(Offer each:offers){

          if(each.Location.equals("VA")&&each.salary>100000&&each.jobTitle.equals("SDET")){

              each.getInfo();
          }


      }
        System.out.println("==============================");

        ArrayList<Offer> localOffers = new ArrayList<>();

        localOffers.addAll(offers);

        localOffers.removeIf(p->!p.Location.equals("VA"));

        System.out.println("VA offers: "+ localOffers.size());

        System.out.println("=================================");

        ArrayList<Offer> SdetOrQaOffers = new ArrayList<>(offers);

        SdetOrQaOffers.removeIf(p->!p.jobTitle.equals("SDET")||!p.jobTitle.equals("QA"));

        System.out.println("SDET or QA offers is" + SdetOrQaOffers.size()); // this is wrong
        System.out.println("===================================");

        ArrayList<Offer> goodSalary = new ArrayList<>(offers);
        goodSalary.removeIf(p->p.salary<160000);

        System.out.println("Salaries more than 160K: "+goodSalary.size());

        System.out.println("==================================");

        ArrayList<Offer> fullTime = new ArrayList<>(offers);

        fullTime.removeIf(p->!p.isFullTime);

        System.out.println("full time count: "+fullTime.size());

    }
}
