import java.util.*;
class SecondLargest{
	public static int findSecondLargest(int []a){
		int max=a[0],max1=-1;
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max1=max;
				max=a[i];
			}
		}
		return max1;
		//if the program wants nth largest no.,then we can sort the array (O(nlogn)) and return a[a.length-n].
	}
}
/*class Swap{
	public static <T> void swap(T []a,int i,int j){
		T temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	} 
}
*/
class SegregateArray{
	public static void swap(int []a,int i,int j){
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void segregateArray(int []a){
		int l=0,r=a.length-1;
		while(l<r){
			while(a[l]==0){
				l++;
			}
			while(a[r]==1){
				r--;
			}
			if(l<r){
				SegregateArray.swap(a,l,r);
				l++;r--;
			}
		}
	}
}
class Sort{
	public static int[] sortOrder(int []a){
		Arrays.sort(a);
		int b[] = new int [a.length];
		int i=0,l=0,r=a.length-1;
		while(l<=r){
			b[i++]=a[r--];
			if(l<=r)
				b[i++]=a[l++];
		}
		return b;
	}
}
class ReverseString{
	public static void swap(char []a,int i,int j){
		char temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static String reverseString(String string){
		char a[]=string.toCharArray();
		int l=0,r=a.length-1;
		while(l<r){
			ReverseString.swap(a,l,r);
			l++;r--;
		}
		string = String.valueOf(a);
		return string;
	}
}
class ReverseMessage{
	public static void swap(String []a,int i,int j){
		String temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static String reverseWords(String message){
		String a[]=message.split(" ");
		int l=0,r=a.length-1;
		while(l<r){
			ReverseMessage.swap(a,l,r);
			l++;r--;
		}
		message = Arrays.toString(a);
		return message;
	}
}
class TaskRunner2{
	Scanner sc = new Scanner(System.in);
	public int[] arrayUtil(){
		System.out.println("Enter size");
		int n=sc.nextInt();
		int [] a= new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		return a;
	}
	public void printArray(int []a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public void getChoice(){
		try{
			System.out.println("Task 2");
			System.out.println("1.Find Second Largest Element");
			System.out.println("2.Segregate 0s on left 1s on right");
			System.out.println("3.Sort in maximum and minimum order");
			System.out.println("4.Reverse a String");
			System.out.println("5.Reverse words in a string");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			int n = sc.nextInt();
			int a[];
			switch(n){
				case 1:
					a = arrayUtil();
					//-1 - array doesnot have second largest element(all elements are equal).
					System.out.println(SecondLargest.findSecondLargest(a));
					getChoice();
					break;
				case 2:
					a=arrayUtil();
					SegregateArray.segregateArray(a);
					printArray(a);
					getChoice();
					break;
				case 3:
					a=arrayUtil();
					int temp[] = Sort.sortOrder(a);
					printArray(temp);
					getChoice();
					break;
				case 4:
					//sc.nextLine();
					String string =sc.next();
					string=ReverseString.reverseString(string);
					System.out.println(string);
					getChoice();
					break;
				case 5:
					sc.nextLine();
					String message = sc.nextLine();
					message = ReverseMessage.reverseWords(message);
					System.out.println(message);
					getChoice();
					break;
				case 6:
					break;
				default :
					System.out.println("Enter correct choice");
					break;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[]){
		new TaskRunner2().getChoice();
	}
}