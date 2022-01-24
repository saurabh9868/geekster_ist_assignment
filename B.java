package saurabh_geekster;

class A
{
    public A()
    {
        System.out.println("constructor");  //public constructor
    }
}


public class B
{
    public static void main(String[] args){
        A a = new A();

    }	//Compile Time Error
}

