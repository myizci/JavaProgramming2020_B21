package day48_Abstraction;

public interface InterfaceRules {
   public static final  int a=10;  // By default , all variables are public static final in a Interface class,
                            // that is why they are grayed out!!



    public static void main(String[] args) {
        System.out.println(a);  //  a is a static variable
        System.out.println(InterfaceRules.a);
       // a=100;   // cannot reassign a value to variable, they are all final!!!!!!!!!!
    }


    public default void m(){

    }


}

/*
Interface: cannot have objects
What we can have:
variables: public static final !!!!!!!!!!!!!!!!!!!!!!!!!
methods: static methods  & abstract methods && default methods


What we cannot have:
constructor
instance methods
instance variables
static blocks

Why we need interface:

A CLASS CAN EXTEND ONE CLASS
A CLASS IMPLEMENT MULTIPLE INTERFACES

ABSTRACT VS INTERFACE

1) Both use for achieving abstraction
2) Both meant to be inherited (extends, implements)
3) Neither can be FINAL!!!
4) Neither can be instantiated and have objects


ABSTRACT:

A class can extend only one Abstract Class
It can everything a regular class can + abstract method
It can can have static blocks

INTERFACE:

A class can implement MULTIPLE interfaces
It can have only public static final variables
It can have only abstract, static, and default methods
It cannot have static blocks



 */