package com.silentpeople.exam1;

import java.util.*;

public class Calculator3 {

	public static void main(String[] args) {
	      
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print(" 계산식을 입력하세요 >> " );
	      String input = sc.nextLine();
	      
	      
	       int plus    = 0;  // 양수값
	       int minus    = 0;  // 음수값
	       int sum    = 0;  // 합계
	       int mul      = 1;  // 곱셈
	       int div      = 1;  // 나눗셈
	       
	       String[] wordsList = new String[input.length()];

	             // 입력한 계산식 문자열을 한자리씩 쪼개서 배열에 담는다
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
	                     wordsList[e] = "0"; // 계산완료된 배열은 삭제한다
	                     e = e + 1;
	                     while (YN == "N") {
	                        if (isNumber(wordsList[e])) {
	                           tot += wordsList[e];
	                           wordsList[e] = "0"; // 계산완료된 배열은 삭제한다
	                           e = e + 1;
	                           continue;
	                        } else {
	                           YN = "N";
	                        }
	                     }
	                  }
	                  plus += Integer.parseInt(tot); // 양수 값이 두자리수면 추가로 더한다
	                  e = e - 1;

	               } else if (wordsList[e].equals("-")) {
	                  e = e + 1;
	      
	                  if (isNumber(wordsList[e])) {
	                     System.out.println(" - " + wordsList[e]);
	                     tot += wordsList[e];
	                     wordsList[e] = "0"; // 계산완료된 배열은 삭제한다
	                     e = e + 1;
	                     while (YN == "N") {
	                        if (isNumber(wordsList[e])) {
	                           tot += wordsList[e];
	                           wordsList[e] = "0"; // 계산완료된 배열은 삭제한다
	                           e = e + 1;
	                           continue;
	                        } else {
	                           YN = "N";
	                        }
	                     }
	                  }
	                  minus += Integer.parseInt(tot); // 음수 값이 두자리수면 추가로 더한다
	                  e = e - 1;

	                }
	         
	               else {
	                  // 아마도 첫번째 값이 들어올 것
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
	            // 총 합계를 계산한다
	            sum =  plus - minus;
	            System.out.println(" 결과 >> " + sum );
	            System.out.println(plus + " + " + minus );
	            sc.close();
	   }

	   // 숫자인지 판별하는 메소드
	   public static boolean isNumber(String num) {

	      try {
	    	  
	          Integer.parseInt(num); // 숫자로 형변환이 가능한지 체크한다
	          
	      } catch (NumberFormatException e) {

	         return false; // 실패하면 숫자가 아니다

	      }

	      return true; // 성공하면 숫자다.
	   }
	   
	   


	}