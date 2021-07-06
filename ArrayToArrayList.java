import java.util.*;
class ArrayToArrayList{
	public void printList(List<Integer>list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public void method(){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter size");
			int n=sc.nextInt();
			int [] a= new int [n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<n;i++)
				list.add(a[i]);
			printList(list);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
	}
	public static void main(String [] args){
		new ArrayToArrayList().method();
	}
}