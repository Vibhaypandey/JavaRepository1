package Mypack;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1.India\n2.Srilanka\n3.australia\n4.nepal");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a choice: ");
		int num = sc.nextInt();
		switch(num) {
		case 1: System.out.println("capital of india is : Delhi");
		        break;
		case 2: System.out.println("capital of srilanka is : colambo");
		        break;
		case 3: System.out.println("capital of australia : cenbera");
		        break;
		case 4: System.out.println("captal of nepal: kathmandu");
		        break;
		default: 
		       System.out.println("please enter a valid a input");
		
		}

	}

}
