package Mypack;

import java.util.Scanner;

public class Arthmetic {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter a input:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num;
		char ch;
		String opt;
		
		System.out.println("+.'Addition\n -.Subrtraction\n *.Multiplication\n //.'division'");
		System.out.println("enter a user choice:");
		 opt  = in.next();
		ch = opt.charAt(0);
		switch(ch)
		{
		case '+': num = num1+num2 ;
                System.out.println(num);
                break;
		case '-': num = num1-num2 ;
                System.out.println(num);
                break;

		case '*': num = num1*num2 ;
                System.out.println(num);
                break;

		case '/': num = num1/num2 ;
                System.out.println(num);
                break;

        default:
        	    System.out.println("enter a valid input");
       
		}

	}

}
