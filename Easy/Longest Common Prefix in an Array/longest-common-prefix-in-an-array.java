//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
/*
class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        
        //sorting makes a all strings stored according to the alphabetical oder 
        Arrays.sort(arr);
        
        // as array elements are sorted it enogh to check these two elemet to find common prefix
        String s1=arr[0];
        String s2=arr[n-1];
        
        int index=0;
        while(index<s1.length() && index < s2.length())
        {
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
       if(index==0)
        {
            return "-1";
        }
        else
        {
            return s1.substring(0,index);
        }
      //  return index ? s1.substring(0, index) : "-1";
    }
}
*/
class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        if(n == 1) return arr[0];
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for(int i = 1;i < arr.length; i++) {
            String s = arr[i];
            //if the prefix got bigger than arr[i] then prefix should be 
            // equal to the length of string arr[i] 
            if(sb.length() > s.length()) sb.setLength(s.length());
            // if the whole stirng arr[i] equates with the prefix then no 
            // need to check further
            if(sb.toString().equals(s)) continue;
            int ptr = 0; 
            for(int j = 0;j < s.length() && ptr < sb.length(); j++, ptr++) {
                if(sb.charAt(ptr) != s.charAt(j)) {
                    // unmatch part trimmed
                    sb.delete(ptr, sb.length());
                    break;
                }
            }
        }
        return sb.toString().length() == 0 ? "-1" : sb.toString();
    }
}