package com.task2.filedemo;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

class FileDemo{
	public void method(){
		Scanner scanner = new Scanner(System.in);
		try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter("sample.txt"))){
			System.out.println("Enter no. of lines to write");
			int noOfLines = scanner.nextInt();
			int i=1;
			scanner.nextLine();
			while(i<=noOfLines){
				String string = scanner.nextLine();
				String sentence = "Line "+i+" :\t"+string;
				fileWriter.write(sentence);
				fileWriter.newLine();
				i++;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			scanner.close();
		}
	}
	public static void main(String [] args){
		new FileDemo().method();
	}
}