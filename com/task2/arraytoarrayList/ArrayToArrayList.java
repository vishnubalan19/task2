package com.task2.arraytoarrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayToArrayList{
    public void printList(List<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void method(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter size");
            int size=scanner.nextInt();
            int [] array= new int [size];
            for(int i=0;i<size;i++){
                array[i]=scanner.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++)
                list.add(array[i]);
            printList(list);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
    public static void main(String [] args){
        new ArrayToArrayList().method();
    }
}