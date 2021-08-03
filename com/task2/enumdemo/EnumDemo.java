package com.task2.enumdemo;
import java.util.Scanner;
enum Rainbow{
	Violet(1),Indigo(2),Blue(3),Green(4),Yellow(5),Orange(6),Red(7);
	private int value;
	Rainbow(int value){
		this.value = value;
	}
	public int getValue(){
		return this.value;
	}
}
class EnumDemo{
	public void method(){
		Scanner scanner = new Scanner(System.in);
		try{
			Rainbow [] rainbow = Rainbow.values();
			for(Rainbow r : rainbow)
				System.out.println("Color Code of "+r+" is "+r.getValue());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			scanner.close();
		}
	}
	public static void main(String [] args){
		new EnumDemo().method();
	}
}