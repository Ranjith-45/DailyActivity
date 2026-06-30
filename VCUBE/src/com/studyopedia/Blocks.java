package com.studyopedia;

 public class Blocks{
    //static blocks are loaded before main method is started ..
    //it is mainly used for DBMS connections..
	//instance blocks are loaded whenever object is created.
	 
    static  Blocks bd= new Blocks();//#1 this block is executed because here static variable is there 
    //static variables are stored in method area 
    public static void main(String[] args){
        System.out.println("Main method started .."); //#4
    }
    static {
            System.out.println("Static block loaded..");//#2
            Blocks bd= new Blocks();//#3
     }
        //instance blocks are not declaring with key words instance
    {
            System.out.println("Instance block loaded...");
            //Blocks bd= new Blocks(); here it will executed...
    }
    
}