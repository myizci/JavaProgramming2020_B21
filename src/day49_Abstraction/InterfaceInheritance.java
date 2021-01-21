package day49_Abstraction;


interface X{
   void x();
}


interface Y{
    void y();
}

interface Z{
    void z();
}

public interface InterfaceInheritance extends X, Y, Z{
    void q();
}


class practice implements InterfaceInheritance {
    @Override
   public void q(){}

   public void x(){}

   public void y(){}

   public void z(){}
}