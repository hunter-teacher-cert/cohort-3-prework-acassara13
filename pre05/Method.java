import java.io.*;
import java.util.*;

public class Method {

  //Question 2 Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.
    public static boolean isDivisible(int n, int m){
      if (n%m==0) {
        return true;
      } 
      return false;
    }

  //Question 3 Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.
    public static boolean isTriangle(int l1, int l2, int l3) {	
		
		  if (l1 > (l2 + l3)) {
			  return false;
		} else if (l2 > (l1 + l3)) {
			  return false;
		} else if (l3 > (l1 + l2)) {
			  return false;
		} else {
			  return true;
		}
	}
// Question 4 Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.
  
}
   
