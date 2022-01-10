package saurabh_geekster;

public class count_vowels_in_a_string {
    public static void main(String[] args) {
        String s="abcdD{e^A7`FaE35ibgI,E)";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'||ch=='u'||ch=='A' || ch=='E' ||ch=='I' || ch=='O'||ch=='U' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
