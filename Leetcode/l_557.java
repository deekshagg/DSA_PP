package Leetcode;

class Solution {
    public String reverseWords(String s) {
        String a[] = s.split(" ");
        for(int i = 0; i < a.length ; i++){
            char ch[] = a[i].toCharArray();
            swap(ch, 0, ch.length-1);
            a[i] = toString(ch);
        }
        return String.join(" ",a);
    }
    public void swap(char[] str, int i, int j ){
        while(i<=j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
    public static String toString(char[] a)
    {
        // Creating object of String class
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
 
        return sb.toString();
    }
}