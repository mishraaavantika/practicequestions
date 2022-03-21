public class newclass {
	public static int bs(int n,int target,int arr[])
	{
		int start=0,end=arr.length-1;
		int mid=0;
		while(start<=end) {	
			mid=(start+end)/2;
			if(arr[mid]<target){
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else
			return start;
		}
		return start;
		}
	
	
	public static int bs1(int n,int target,int arr[])
	{
		int start=0,end=arr.length-1;
		int mid=0;
		while(start<=end) {	
			mid=(start+end)/2;
			if(arr[mid]<target){
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else
			return mid;
		}
		return end;
		}
	     
	
	public static void main(String[] args) {
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the array");
		 for(int i=0;i<n;i++)
			 arr[i]=sc.nextInt();
		 
		 System.out.println("enter the target for finding the cieling");
		 int target=sc.nextInt();
		 int q=bs(n,target,arr);
		System.out.println("the index of the element found is "+arr[q]); 
		
		
		System.out.println("enter the target for finding the floor");
		 int target1=sc.nextInt();
		 int q1=bs1(n,target1,arr);
		System.out.println("the index of the element found is "+arr[q1]); 
		
		sc.close();
		  }
}
