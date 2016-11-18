package com.silentpeople.exam1;

import java.util.Scanner;

public class 실습1 {

		public static void main(String[] args) {
			
	        // 실습1-1
			
			Scanner sc = new Scanner(System.in);
			  System.out.println("첫 번째 숫자를 입력하시오:");
			  int a = sc.nextInt();
			  System.out.println("두 번째 숫자를 입력하시오:");
			  int b = sc.nextInt();
			  System.out.println("연산자를 선택하시오: (+, -, *, /)");
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
			   System.out.println("잘못된 연산자 입력입니다");
			  }
		
			  /*System.out.println("입력을 시작하세요!!");
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
