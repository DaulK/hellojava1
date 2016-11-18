package com.silentpeople.exam1;

import java.util.*;

public class Calculator3 {

	public static void main(String[] args) {
	      
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print(" ������ �Է��ϼ��� >> " );
	      String input = sc.nextLine();
	      
	      
	       int plus    = 0;  // �����
	       int minus    = 0;  // ������
	       int sum    = 0;  // �հ�
	       int mul      = 1;  // ����
	       int div      = 1;  // ������
	       
	       String[] wordsList = new String[input.length()];

	             // �Է��� ���� ���ڿ��� ���ڸ��� �ɰ��� �迭�� ��´�
	             for(int i=0; i<input.length(); i++){            
	                
	                String words = input.trim().substring(i, i+1); 
	               wordsList[i] = words;   
	               
	             }          

	            for(int e=0; e<wordsList.length; e++){
	            	
	               String YN ="";
	               String tot = "0";
	               
	               if (wordsList[e].equals("+")) {
	                  e = e + 1;
	                  if (isNumber(wordsList[e])) {
	                     System.out.println(" + " + wordsList[e]);
	                     tot += wordsList[e];
	                     wordsList[e] = "0"; // ���Ϸ�� �迭�� �����Ѵ�
	                     e = e + 1;
	                     while (YN == "N") {
	                        if (isNumber(wordsList[e])) {
	                           tot += wordsList[e];
	                           wordsList[e] = "0"; // ���Ϸ�� �迭�� �����Ѵ�
	                           e = e + 1;
	                           continue;
	                        } else {
	                           YN = "N";
	                        }
	                     }
	                  }
	                  plus += Integer.parseInt(tot); // ��� ���� ���ڸ����� �߰��� ���Ѵ�
	                  e = e - 1;

	               } else if (wordsList[e].equals("-")) {
	                  e = e + 1;
	      
	                  if (isNumber(wordsList[e])) {
	                     System.out.println(" - " + wordsList[e]);
	                     tot += wordsList[e];
	                     wordsList[e] = "0"; // ���Ϸ�� �迭�� �����Ѵ�
	                     e = e + 1;
	                     while (YN == "N") {
	                        if (isNumber(wordsList[e])) {
	                           tot += wordsList[e];
	                           wordsList[e] = "0"; // ���Ϸ�� �迭�� �����Ѵ�
	                           e = e + 1;
	                           continue;
	                        } else {
	                           YN = "N";
	                        }
	                     }
	                  }
	                  minus += Integer.parseInt(tot); // ���� ���� ���ڸ����� �߰��� ���Ѵ�
	                  e = e - 1;

	                }
	         
	               else {
	                  // �Ƹ��� ù��° ���� ���� ��
	                  if (isNumber(wordsList[e])) {
	                     System.out.println(" " + wordsList[e]);
	                     tot += wordsList[e];
	                     wordsList[e] = "0";
	                     e = e + 1;
	                     while (YN == "N") {
	                        if (isNumber(wordsList[e])) {
	                           tot += wordsList[e];
	                           wordsList[e] = "0";
	                           e = e + 1;
	                           continue;
	                        } else {
	                           YN = "N";
	                        }
	                     }
	                     sum += Integer.parseInt(tot);
	                     e = e - 1;
	                  }
	               }
	            }
	            // �� �հ踦 ����Ѵ�
	            sum =  plus - minus;
	            System.out.println(" ��� >> " + sum );
	            System.out.println(plus + " + " + minus );
	            sc.close();
	   }

	   // �������� �Ǻ��ϴ� �޼ҵ�
	   public static boolean isNumber(String num) {

	      try {
	    	  
	          Integer.parseInt(num); // ���ڷ� ����ȯ�� �������� üũ�Ѵ�
	          
	      } catch (NumberFormatException e) {

	         return false; // �����ϸ� ���ڰ� �ƴϴ�

	      }

	      return true; // �����ϸ� ���ڴ�.
	   }
	   
	   


	}