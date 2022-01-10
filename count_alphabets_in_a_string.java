package saurabh_geekster;

public class count_alphabets_in_a_string {
    public static void main(String[] args) {
        String s="abcdD{e^7`Fa35bg,E)";
        int count=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch>=65 && ch<91 ||ch>=97 && ch<123 ){
                count++;
            }
           // System.out.print(ch +" ");
        }
        System.out.println(count);
    }
}
