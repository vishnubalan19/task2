import java.util.*;
import java.io.*;
class FileDemo{
	public void method(){
		Scanner sc = new Scanner(System.in);
		try(BufferedWriter filewriter = new BufferedWriter(new FileWriter("sample.txt"))){
			System.out.println("Enter no. of lines to write");
			int n = sc.nextInt();
			int i=1;
			sc.nextLine();
			while(i<=n){
				String s = sc.nextLine();
				String ss = "Line "+i+" :\t"+s;
				filewriter.write(ss);
				filewriter.newLine();
				i++;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
	}
	public static void main(String [] args){
		new FileDemo().method();
	}
}