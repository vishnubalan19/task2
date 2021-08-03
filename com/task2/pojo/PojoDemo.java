package com.task2.pojo;


public class PojoDemo{
    private int a1, a2,a3,a4,a5;
    PojoDemo(){
        a1=0;a2=0;a3=0;a4=0;a5=0;
    }
    public void setProperty1(int a1){
        this.a1=a1;
    }
    public void setProperty2(int a2){
        this.a2=a2;
    }
    public void setProperty3(int a3){
        this.a3=a3;
    }
    public void setProperty4(int a4){
        this.a4=a4;
    }
    public void setProperty5(int a5){
        this.a5=a5;
    }
    public int getProperty1(){
        return a1;
    }
    public int getProperty2(){
        return a2;
    }
    public int getProperty3(){
        return a3;
    }
    public int getProperty4(){
        return a4;
    }
    public int getProperty5(){
        return a5;
    }
    @Override
    public String toString(){
        return getProperty1()+" "+getProperty2()+" "+getProperty3()+" "+getProperty4()+" "+getProperty5();
    }
}

