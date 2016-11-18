package com.silentpeople.exam1;

public class class1 {  // 클래스 선언( 클래스명 : class1 )
	
	/*public static void main(String [] args) { // main 메소드(Method)
		byte salary = (byte)2400000;
		long salary2 = 2200000000L;   // 형변환 숙제
		short salary3 = 32000;
		char name = 'a';
		float ratio = (float)1.8; //1.8을 double 로 취급해버림
		float ratio2 = 1.8F;
		double ratio3 = 1.23456789456312459579;
		System.out.println(3);
		System.out.println(1);
		System.out.println('A');    // '' 문자 상수
		System.out.println("ABC");  // "" 문자열 상수
		System.out.println("나는 지금 집에\t가고\t 싶어");
		System.out.println(10%3);
		
	}
	 */
	
	/*public static int add (int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
		
	}
	
	public static void main (String[] args) {
		int ret;
		ret = add(10,20);
		System.out.println("결과값은 = "+ ret);
	}
	*/
	
	public static String[] nameOut(int cnt) {
		
		String[] name={"하하","호호","히히"};
		String[] outname={"a","b","c"};
		
		for(int i=0; i<cnt; i++) {
			outname[i] = name[i];
		}
		return outname;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		String [] name;
		int cnt=2;
		name=nameOut(cnt);
		
		Thread.sleep(4000);
		
		/*try{
		Thread.sleep(4000);
		}
		catch(InterruptedException e){
			System.out.println("InterruptedException 예외가 발생했어요. 죄송합니다.");
		}
		finally{
			System.out.println("정상실행됨!!");
		}*/
		
		for(int i=0; i<cnt; i++){
			System.out.println(i+"번의 이름:"+name[i]);
		}
		
	}
	

}






