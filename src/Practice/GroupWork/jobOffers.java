package Practice.GroupWork;

public class jobOffers {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();

        offer1.setInfo("Greenville",120000,"SDET",true,true,true,true,"GreenIT");
        offer2.setInfo("Atlanta",220000,"QA",true,false,true,false,"BlueIT");
        offer3.setInfo("Charlotte",180000,"Developer",false,true,false,true,"RedIT");
        offer4.setInfo("Charleston",150000,"BA",false,false,true,true,"DarkIT");
        offer5.setInfo("Raleigh",140000,"SDET",true,true,false,false,"BrightIT");

        offer1.getInfo();
        System.out.println("==");
        offer2.getInfo();
        System.out.println("==");
        offer3.getInfo();
        System.out.println("==");
        offer4.getInfo();
        System.out.println("==");
        offer5.getInfo();


    }




}
