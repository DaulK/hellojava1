package com.silentpeople.exam1;

import java.util.Scanner;

public class �ǽ�1 {

		public static void main(String[] args) {
			
	        // �ǽ�1-1
			
			Scanner sc = new Scanner(System.in);
			  System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�:");
			  int a = sc.nextInt();
			  System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�:");
			  int b = sc.nextInt();
			  System.out.println("�����ڸ� �����Ͻÿ�: (+, -, *, /)");
			  String op = sc.next();
			  
			  if(op.equals("+")){
			   System.out.println(a + "+" + b + "=" + (a+b));
			  } else if(op.equals("-")){
			   System.out.println(a + "-" + b + "=" + (a-b));
			  } else if(op.equals("*")){
			   System.out.println(a + "*" + b + "=" + (a*b));
			  } else if(op.equals("/")){
			   System.out.println(a + "/" + b + "=" + (a/(double)b));
			  } else{
			   System.out.println("�߸��� ������ �Է��Դϴ�");
			  }
		
			  /*System.out.println("�Է��� �����ϼ���!!");
				Scanner sc = new Scanner(System.in);
				
				int num1 = sc.nextInt();
				
				char c1 = sc.next().charAt(0);
				
				int num2 = sc.nextInt();
				
				char c2 = sc.next().charAt(0);
				
				if(c1 == '+') {
					System.out.println(num1+num2);
					
				} else if(c1 == '-') {
					
					
				} else if(c1 == '*') {
					
					
				} else if(c1 == '/'){
					
					
				}*/
			
	    }
	    

}
