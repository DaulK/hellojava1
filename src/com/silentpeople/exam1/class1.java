package com.silentpeople.exam1;

public class class1 {  // Ŭ���� ����( Ŭ������ : class1 )
	
	/*public static void main(String [] args) { // main �޼ҵ�(Method)
		byte salary = (byte)2400000;
		long salary2 = 2200000000L;   // ����ȯ ����
		short salary3 = 32000;
		char name = 'a';
		float ratio = (float)1.8; //1.8�� double �� ����ع���
		float ratio2 = 1.8F;
		double ratio3 = 1.23456789456312459579;
		System.out.println(3);
		System.out.println(1);
		System.out.println('A');    // '' ���� ���
		System.out.println("ABC");  // "" ���ڿ� ���
		System.out.println("���� ���� ����\t����\t �;�");
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
		System.out.println("������� = "+ ret);
	}
	*/
	
	public static String[] nameOut(int cnt) {
		
		String[] name={"����","ȣȣ","����"};
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
			System.out.println("InterruptedException ���ܰ� �߻��߾��. �˼��մϴ�.");
		}
		finally{
			System.out.println("��������!!");
		}*/
		
		for(int i=0; i<cnt; i++){
			System.out.println(i+"���� �̸�:"+name[i]);
		}
		
	}
	

}






