package saurabh_geekster;

public class Person
{
    // fields
    private String name;
    private String email;
    private String phoneNumber;

    // constructor
    public Person(String theName)
    {
        this.name = theName;
    }
    public Person(String thename,String email){
        this.name=thename;
        this.email=email;
    }
    public Person(String thename,String email,String ph_no){
        this.name=thename;
        this.email=email;
        this.phoneNumber=ph_no;
    }

    // methods - getters
    public String getName() { return this.name;}
    public String getEmail() { return this.email;}
    public String getPhoneNumber() { return this.phoneNumber;}

    // methods - setters
    public void setName(String theName) { this.name = theName;}
    public void setEmail(String theEmail) {this.email = theEmail;}
    public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
    public String toString()
    {
        return this.name + " " + this.email + " " + this.phoneNumber;
    }

    // main method for testing
    public static void main(String[] args)
    {
        Person p1 = new Person("Sana");
        System.out.println(p1);
        Person p2 = new Person("Jean");
        p2.setEmail("jean@gmail.com");
        p2.setPhoneNumber("404 899-9955");
        System.out.println(p2);
        Person p3=new Person("saurabh","sgarg@gmail.com","844802");
        System.out.println(p3);
        Person p4=new Person("vanshita","sluv@gmail.com");
        p4.setPhoneNumber("567876756");
        System.out.println(p4.getEmail());
        System.out.println(p4);
    }
}

