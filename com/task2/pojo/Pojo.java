package com.task2.pojo;

import java.util.Scanner;

class Pojo{
    public void getValue(){
        Scanner scanner = new Scanner(System.in);
        try{
            PojoDemo pojoDemo = new PojoDemo();
            System.out.println("Enter value for property 1");
            int value = scanner.nextInt();
            pojoDemo.setProperty1(value);
            System.out.println("Enter value for property 2");
            value=scanner.nextInt();
            pojoDemo.setProperty2(value);
            System.out.println("Enter value for property 3");
            value=scanner.nextInt();
            pojoDemo.setProperty3(value);
            System.out.println("Enter value for property 4");
            value=scanner.nextInt();
            pojoDemo.setProperty4(value);
            System.out.println("Enter value for property 5");
            value=scanner.nextInt();
            pojoDemo.setProperty5(value);
            System.out.println(pojoDemo);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
    public static void main(String [] args){
        new Pojo().getValue();
    }
}