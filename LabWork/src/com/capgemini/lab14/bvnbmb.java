package com.capgemini.lab14;

public class bvnbmb {
public static void main(String[] args) {
int a=factorial(5);
System.out.println(a);
}
public static int factorial(int a) {
    int fact;
		if(a==1) {
  	  return 1;
    }
    else {
          fact=a*factorial(a-1); 
  	  return fact;
  	  
    }
	}
}
