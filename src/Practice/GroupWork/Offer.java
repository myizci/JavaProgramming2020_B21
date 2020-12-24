package Practice.GroupWork;

public class Offer {
    public String Location;
    public double salary;
    public String jobTitle;
    public boolean hasBenefit;
    public boolean WFH;
    public boolean hasPTO;
    public boolean isFullTime;
    public String companyName;
/*
MyOffers:
           + create 7 objects of Offer class and store them into an ArrayList of Offer
            write a program that can only keep the offers from local area
            write a program that can remove all offers that are not for SDET or QA
            write a program that can remove all offers that are not work from home
            write a program that can remove all offers that does not have benefits
            write a program that can remove the offers that are not full Time

 */

    public void setInfo(String location, double salary, String jobTitle, boolean hasBenefit, boolean WFH, boolean hasPTO, boolean isFullTime, String companyName) {
        Location = location;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
        this.WFH = WFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.companyName = companyName;
    }

    public void getInfo(){


        System.out.println("Company: " + companyName+ "\nLocation: " + Location + "\nSalary: $" + salary +
                "\nJob Title: " + jobTitle + "\nHas Benefit: " + hasBenefit + "\nWork From Home: " + WFH +
                "\nHas PTO: " + hasPTO + "\nis Full time: " + isFullTime);
        System.out.println("================================");

    }
}
