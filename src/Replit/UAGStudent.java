package Replit;

public class UAGStudent {
    private String name;
    private int grade;
    private static String principalName;
    private String studentID;
    private static int nextID=100;


    public UAGStudent(String name, int grade ) {
        this.name = name;
        this.grade = grade;
        this.studentID=""+name.toUpperCase().charAt(0)+nextID;
    }

public static void newPrincipal(String newPrincipal){
        principalName = newPrincipal;
}

public static void resetID(){
        nextID=99;
}

public String toString(){
        return name + " "+ studentID;
}


}
