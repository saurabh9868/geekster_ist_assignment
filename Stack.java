package saurabh_geekster;

public class Stack {
    private int max=20;
    private int arr[]=new int[20];
    private int top;
    public boolean isEmpty(){
      return top>-1;
    }
    public void push(int x){
        if(top>=max-1){
            System.out.println("stack overflow");
            return;
        }
        else{
            top++;
            arr[top]=x;

        }
    }
    public int pop(){
        int x=0;
        if(top<1){
            System.out.println("stack underflow");
            return -1;
        }
        else{
           x=arr[top];
            top--;
        }
        return x;
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
