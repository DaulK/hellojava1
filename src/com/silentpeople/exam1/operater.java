package com.silentpeople.exam1;

public class operater {

	public static void main(String[] args) {
		
		/*String str = "test";
		boolean endsWith = str.endsWith("t");
		System.out.println("endsWith:" + endsWith);
		
		String str2 = "abcdef";
		int indexOf = str2.indexOf("d");
		System.out.println("indexOf :" + indexOf);
		
		String str3 = "AndroidApp";
		int lastIndexOf = str3.lastIndexOf("A");
		System.out.println("lastIndexOf:" + lastIndexOf);
		
		String str4 = "abcdef";
		int length = str4.length();
		System.out.println("length:" + length);
		
		String str5 = "A*B*C*D";
		String replace = str5.replace("*", "-");
		System.out.println("replace:" +replace);
		
		String str6 = str.substring(0,3);
		System.out.println(str6);*/
		
	/*	
		int num1 = 12345;
		// String str7 = num1.toString();   --> 객체가 아니라 변수이기 때문에  
		String str4 = String.valueOf(num1);
		long num2 = 22121212121L;
		//String str8 = num2.toString();
		String str5 = String.valueOf(num2);
		System.out.println(str4);
		System.out.println(str5);
	*/
		int age = 3;
		switch (age) {
		case 1:
				System.out.println("1살 입니다.");
				break;
		case 2:
				System.out.println("2살 입니다.");
				break;
		case 3:
				System.out.println("3살 입니다.");
				break;
				default:
		}
		
		int age1 = 4;
		if (age1 == 1) {
			System.out.println("1살 입니다.");		
		}
		else if (age1 == 2) {
			System.out.println("2살 입니다.");
		}
		else if (age1 == 3) {
			System.out.println("3살 입니다.");
		}
		else
			System.out.println("몰라");
		
		
		
		
	}

}
