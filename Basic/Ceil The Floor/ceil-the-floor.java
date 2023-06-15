//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Pair ans = new Solve().getFloorAndCeil(arr, n, x);
            System.out.println(ans.floor + " " + ans.ceil);
        }
    }
}

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

// } Driver Code Ends


//User function Template for Java

class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        int floor =-1;
        int ceil=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=x)
            {
                floor=Math.max(floor, arr[i]);
            }
            if(arr[i]>=x)
            {
                if(ceil==-1)
                {
                    ceil=arr[i];
                }
                else
                {
                    ceil=Math.min(arr[i],ceil);
                }
            }
        }
        return new Pair(floor,ceil);
    }
}

/*

//User function Template for Java
class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        int start=0;
        int end=n-1;
        int floor=-1;
        int ceil=-1;
        while(start<=end){
            int mid=((end-start)/2)+start;
            if(arr[mid]<=x){
                floor=arr[mid];
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        start=0;
        end=n-1;
        while(start<=end){
            int mid=((end-start)/2)+start;
            if(arr[mid]>=x){
                ceil=arr[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new Pair(floor,ceil);
    }
}
*/
