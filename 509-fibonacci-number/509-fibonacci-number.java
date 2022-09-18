class Solution {
    
    //MEMOIZATION APPROACH
    
    public int fibonacci(int n,int arr[]){
        if(n<=1){
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        
        return arr[n]=fibonacci(n-1,arr)+fibonacci(n-2,arr);
    }
    
    public int fib(int n) {
     
        int arr[]=new int[n+1];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
              
        return fibonacci(n,arr);
        
    }
}