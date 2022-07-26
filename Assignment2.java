package com.besant.assignment;

public class Assignment2 {

	public static void main(String[] args) {
		//even numbers check//					
				System.out.println("even Numbers");

				for(int i=1; i<=10; i++) {
					if(i%2==0) {
						
						System.out.println(i);
					}
				
				}
				
				//odd numbers check//
				System.out.println("Odd Number");
				for(int j=1; j<=10; j++) {
					if(j%2==1) {
						System.out.println(j);
					}
				}
				
				//prime numbers check//
				System.out.println("Prime Numbers");
				for (int i=1; i<=10; i++) {
		            int c=0;
		            for (int j=1; j<=i; j++) {
		                if (i%j==0)
		                   c++;
		                }
		            if (c==2)
		                System.out.println(i);
				
			}
				//fibonacci series//			
				System.out.println("Fibonacci Series");

				 int n=30, firstNum=0, secondNum=1;
			        
				    System.out.println("Fibonacci Series Upto " + n + ": ");
				    
				    while (firstNum<=n) {
				      System.out.print(firstNum + ", ");

				      int thirdNum  = firstNum + secondNum;
				      firstNum = secondNum;
				      secondNum = thirdNum;

		}
			   //reverse//
				    System.out.println("\n"+"Reverse");
				    int number=12345;
				    int reverse=0;
				    while(number!=0) {
				    	reverse=reverse*10 + number%10;
				    	number=number/10;
				    }
				    {
				    System.out.println(reverse);
				    }
				 
				    
				    //palindrome//
				    int num=1234321;
				    int originalNum =num;
				    int rev=0;
				    while(num!=0) {
				    	rev=rev*10 + num%10;
				    	num=num/10;
				    }
				    if(originalNum==rev) {
				    	System.out.println(originalNum + "it is palindrome");
				    }
				    else {
				    	System.out.println(originalNum + "it is not palindrome");
				    }
				    
				    	
			}

				
	}


