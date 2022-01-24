package saurabh_geekster;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class mybook extends Book{
    public void setTitle(String s){
        this.title=s;
    }
}
public class some{
    public static void main(String[] args ){
        mybook b=new mybook();
        b.setTitle("my book ");
        System.out.println(b.getTitle());
    }
}

