import java.util.*;
class OverloadingDemo{
	int val1=0,val2=0,val3=0;
	OverloadingDemo(){
		val1=1;
		val2=1;
		val3=1;
	}
	OverloadingDemo(int val1,int val2,int val3){
		this.val1=val1;
		this.val2=val2;
		this.val3=val3;
	}
	OverloadingDemo(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
	}
	public String toString(){
		return val1+" "+val2+" "+val3;
	}
}
class Overloading{
	public static void main(String args[]){
		OverloadingDemo o1 = new OverloadingDemo();
		OverloadingDemo o2 = new OverloadingDemo(3,2,5);
		OverloadingDemo o3 = new OverloadingDemo(2,5);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}
}