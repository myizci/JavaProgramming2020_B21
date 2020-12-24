package Office_Hours.Practice_12_23_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private ProductOwner productOwner;
    private ScrumMaster scrumMaster;
    private BusinessAnalyst businessAnalyst;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();


    public ScrumTeam(ProductOwner productOwner) {
       setProductOwner(productOwner);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster) {
        this(productOwner);
        setScrumMaster(scrumMaster);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster, BusinessAnalyst businessAnalyst) {

        this(productOwner,scrumMaster);
        setBusinessAnalyst(businessAnalyst);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }


    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTester(Tester[] testers){
      this.testers.addAll(Arrays.asList(testers));

//        for(Tester each: testers){
//
//            addTester(each);
//        }

    }

    public void addDeveloper(Developer[] developers){
        //this.developers.addAll(Arrays.asList(developers));
        for(Developer each: developers) addDeveloper(each);  // we can omit {} for a single statement

    }


    public void removeTester(String ID){
        testers.removeIf(p->p.ID.equals(ID));
    }


    public void removeDeveloper(String ID){
        developers.removeIf(p->p.ID.equals(ID));
    }


    public ProductOwner getProductOwner(){
        return this.productOwner;
    }

    public void setProductOwner(ProductOwner productOwner){
        this.productOwner=productOwner;
    }


    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public BusinessAnalyst getBusinessAnalyst() {
        return businessAnalyst;
    }

    public void setBusinessAnalyst(BusinessAnalyst businessAnalyst) {
        this.businessAnalyst = businessAnalyst;
    }


    @Override
    public String toString() {
        return "ScrumTeam{ productOwner= " +getProductOwner().name +
                ", scrumMaster=" + getScrumMaster().name +
                ", businessAnalyst=" + getBusinessAnalyst().name +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
