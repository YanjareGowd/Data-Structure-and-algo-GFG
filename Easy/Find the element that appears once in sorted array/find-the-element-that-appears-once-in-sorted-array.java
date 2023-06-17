//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
        //code here.
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        
        int lo=1, hi=n-2;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            
            if((mid%2==1 && arr[mid-1]==arr[mid]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
        
    }
}