package com.task2.taskrunner;
import java.util.Arrays;
import java.util.Scanner;

public class TaskRunner {
    Scanner scanner = new Scanner(System.in);
    public static int findSecondLargest(int []array){
        int max=array[0],max1=-1;
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max1=max;
                max=array[i];
            }
            else if(max1<array[i]){
                max1=array[i];
            }
            else ;
        }
        return max1;
        //if the program wants nth largest no.,then we can sort the array (O(nlogn)) and return a[a.length-n].
    }

    /*class Swap{
        public static <T> void swap(T []a,int i,int j){
            T temp = a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    */

    public static void swap(int []array,int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void segregateArray(int []array){
        int left=0,right=array.length-1;
        while(left<right){
            while(array[left]==0){
                left++;
            }
            while(array[right]==1){
                right--;
            }
            if(left<right){
                TaskRunner.swap(array,left,right);
                left++;right--;
            }
        }
    }


    public static int[] sortOrder(int []array){
        Arrays.sort(array);
        int arrayOrdered[] = new int [array.length];
        int i=0,left=0,right=array.length-1;
        while(left<=right){
            arrayOrdered[i++]=array[right--];
            if(left<=right)
                arrayOrdered[i++]=array[left++];
        }
        return arrayOrdered;
    }


    public static void swap(char []a,int i,int j){
        char temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static String reverseString(String string){
        char array[]=string.toCharArray();
        int left=0,right=array.length-1;
        while(left<right){
            TaskRunner.swap(array,left,right);
            left++;right--;
        }
        string = String.valueOf(array);
        return string;
    }


    public static void swap(String []a,int i,int j){
        String temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static String reverseWords(String message){
        String array[]=message.split(" ");
        int left=0,right=array.length-1;
        while(left<right){
            TaskRunner.swap(array,left,right);
            left++;right--;
        }
        message = Arrays.toString(array);
        return message;
    }

    public int[] arrayUtil(){
        System.out.println("Enter size");
        int size=scanner.nextInt();
        int [] array= new int [size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public void printArray(int [] array){
        for(int i = 0; i< array.length; i++)
            System.out.print(array[i]+" ");
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
            int choice = scanner.nextInt();
            int array[];
            switch(choice){
                case 1:
                    array = arrayUtil();
                    //-1 - array doesnot have second largest element(all elements are equal).
                    System.out.println(TaskRunner.findSecondLargest(array));
                    getChoice();
                    break;
                case 2:
                    array=arrayUtil();
                    TaskRunner.segregateArray(array);
                    printArray(array);
                    getChoice();
                    break;
                case 3:
                    array=arrayUtil();
                    int temp[] = TaskRunner.sortOrder(array);
                    printArray(temp);
                    getChoice();
                    break;
                case 4:
                    //sc.nextLine();
                    String string =scanner.next();
                    string=TaskRunner.reverseString(string);
                    System.out.println(string);
                    getChoice();
                    break;
                case 5:
                    scanner.nextLine();
                    String message = scanner.nextLine();
                    message = TaskRunner.reverseWords(message);
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
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void main(String args[]){
        new TaskRunner().getChoice();
    }
}

