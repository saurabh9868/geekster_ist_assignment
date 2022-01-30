package saurabh_geekster;

public class find_length_of_string {
    public static int LengthOfString(String str)
    {
        int length=0;
        char[] strCharArray=str.toCharArray();
        for(char c:strCharArray)
        {
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        String s="abcdefgh";
        System.out.println(LengthOfString(s));
    }
}
