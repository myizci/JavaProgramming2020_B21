package day44_Inheritance.Practice;



public class Practice2 extends Practice1{

   boolean isTrue;
    public Practice2(int age,String name,boolean isTrue) {  // the order in () is not important
        super(name,age); // implementation has to be same
        this.isTrue=isTrue;
    }

    public Practice2(){

    }

    public Practice2(int age){

    }
}
