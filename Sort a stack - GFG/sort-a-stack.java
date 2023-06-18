//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public void insertInSorted(Stack<Integer> s,int x){
        if(s.isEmpty()){
            s.push(x);
            
        }
        else if(s.peek()>x){
            int y=s.pop();
            insertInSorted(s,x);
            s.push(y);
            
        }
        else if(s.peek()<=x){
            s.push(x);
        }
        
    }
    public void func(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int temp=s.peek();
        s.pop();
        func(s);
        insertInSorted(s,temp);
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		func(s);
		return s;
	}
}