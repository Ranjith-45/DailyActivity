package com.studyopedia;

public class CharacterCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CHAR
		//2 bytes 16 bits 2^15
		// char range = 0 to 65,535
	    char ch = 'A';
        int num = ch;
        char num1=66;
        char ch1 ='@';
        //character stores the both number and character 
        //It considers if anything in single quotes ' 'then it consider as characters
        //ASSCCI values 65->A to
        System.out.println(ch);   // A
        System.out.println(num);  // 65
        System.out.println(num1); //B
        System.out.println(ch1);//@
        
        //int-->char;
        //double → float → long → int → char → short → byte
        int num2 = 65;
        char ch2 = (char) num;

        System.out.println(ch2);   // A
	}

}
