package com.silentpeople.exam1;

import java.util.*;

public class Calculator2 {

	public static void main(String[] args) {
		/*while(true) {
	         Scanner scanner = new Scanner(System.in);
	         System.out.println("������ �Է����ּ���");
	         String val = scanner.next();
	         
	         System.out.println(val+"=");
	         
	         if(val.indexOf("+") != -1) {
	            StringTokenizer st = new StringTokenizer(val,"+");
	            System.out.println(Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken()));
	            
	         } else if (val.indexOf("-") != -1) {
	            StringTokenizer st = new StringTokenizer(val,"-");
	            System.out.println(Integer.valueOf(st.nextToken())-Integer.valueOf(st.nextToken()));
	            
	         } else if (val.indexOf("/") != -1) {
	            StringTokenizer st = new StringTokenizer(val,"/");
	            System.out.println(Double.valueOf(st.nextToken())/Double.valueOf(st.nextToken()));
	            
	         } else if (val.indexOf("*") != -1) {
	            StringTokenizer st = new StringTokenizer(val,"*");
	            System.out.println(Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken()));
	            
	         } else {
	            System.out.println("������ ����� �Է����ּ���");
	         }
	      }
		*/
		System.out.println("�Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		String calStr = sc.nextLine();
		
		String sign = calStr.substring(1, 2);
		
		switch(sign) {
		
		case "+" :
			String[] num1 = calStr.split("\\+");
			String[] num2 = num1[1].split("\\=");
			
			int n1 = Integer.parseInt(num1[0]);
			int n2 = Integer.parseInt(num2[0]);
			
			System.out.println(n1+n2);
			break;
		
		case "-":
			
			break;
			
		case "*":
			
			break;
			
		case "/":
			
			break;
			
		default :
			//= - * / �̿��� ���� ���� �� ó���� �ڵ�
			System.out.println("+ - * / �߿� �Է����ּ���.");
			break;
		}
		
		
		
		
		
		
		/*
		String[] split = calStr.split("\\+");
		String[] split2 = split[1].split("\\=");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split2[0]);
		*/
		
		
		
		
		
		
		
	}

}
