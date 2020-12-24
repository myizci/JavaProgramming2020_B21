package Replit;

public class Person2 {



    private String firstname, lastname, ssn;
    private int birthmonth, birthday,birthyear;

    public Person2(String firstname, String lastname, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }





    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getBirthday(){
return ""+this.birthmonth +"/"+this.birthday+"/"+this.birthyear;
    }


    public boolean verifySSN(String ssn){
        return (this.ssn.equals(ssn));
    }
}
