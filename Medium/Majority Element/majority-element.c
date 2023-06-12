//{ Driver Code Starts
//Initial Template for C

#include <stdio.h>
#include <stdbool.h>


// } Driver Code Ends
//User function Template for C

// Function to find majority element in the array
// a: input array
// size: size of input array
int majorityElement(int a[], int size)
{
        
    // your code here
    int cnt=0;
    int ele=0;
    for(int i=0;i<size;i++)
    {
        if(cnt==0)
        {
            cnt=1;
            ele=a[i];
        }
        else if(a[i]==ele)
        {
            cnt++;
        }
        else
        {
            cnt--;
        }
    }
    int cnt1=0;
    for(int i=0;i<size;i++)
    {
        if(ele==a[i])
        cnt1++;
    }
    
    if(cnt1>size/2)
    {
        return ele;
    }
    else
    {
        return -1;
    }
}

//{ Driver Code Starts.

int main(){

    int t;
    scanf("%d", &t);

    while(t--){
        int n;
        scanf("%d", &n);
        int arr[n];
        
        for(int i = 0;i<n;i++){
            scanf("%d", &arr[i]);
        }
        printf("%d\n", majorityElement(arr, n));
    }

    return 0;
}

// } Driver Code Ends