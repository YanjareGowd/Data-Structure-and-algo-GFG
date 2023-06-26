//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N=sc.nextInt();
                    String S=sc.next();
                        
                    Solution obj = new Solution();
                    
                    
                    System.out.println(obj.CountPS(S,N));
                    
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java
/*
class Solution
{
    public int CountPS(String S, int N)
    {
        //code here
        int count=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+2;j<=N;j++)
            {
                String str=S.substring(i,j);
                if(isPalindrome(str)==true)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPalindrome(String S)
    {
        int start=0;
        int end=S.length()-1;
        while(start<=end)
        {
            if(S.charAt(start)!=S.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
*/
class Solution
{
     public static  int CountPS(String S, int N)
    {
        //code here
        int tot = 0 ;
        HashSet<String>hs = new HashSet<>() ;

        for(int i = 0 ;i<S.length();i++){

            tot += num_palindroms(S,i,hs) ;


        }
        
        return tot ;
    }
    public static int num_palindroms(String  s, int i , HashSet<String> hs){
        // even palindroms
        int start = i ;int end = i+1 ;int tot = 0;
        while(start >= 0 && end <= s.length()-1){
            if(s.charAt(start) == s.charAt(end)){
                hs.add(s.substring(start,end+1)) ;
                tot  = tot +1 ;
                start -- ;end++ ;
            }
            else{
                break ;
            }
            
        }
        // odd length palindroms
        start = i-1 ; end  = i+1 ;
        while(start >= 0 && end <= s.length()-1){
            if(s.charAt(start) == s.charAt(end)){
                hs.add(s.substring(start,end+1)) ;
                tot ++ ; start -- ;end++ ;
            }
            else{
                break ;
            }
        }
        return tot ;
    }
}