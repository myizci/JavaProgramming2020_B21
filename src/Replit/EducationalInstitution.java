package Replit;

public class EducationalInstitution {

    public int duration;

    public EducationalInstitution() {

    }

    public EducationalInstitution(int duration) {
        this.duration = duration;
    }

    public String graduationRequirements(){
        return this.duration+ " years of study";
    }
}
