package saurabh_geekster;

public class Doog
{
    private String name;

    public Doog(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)
    {
        // ADD CODE HERE
        if(other.equals(this.name)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        Doog d1 = new Doog("Rufus");
        Doog d2 = new Doog("Sally");
        Doog d3 = new Doog("Rufus");
        Doog d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}

