package date;

import java.util.Scanner;



public class StringManipulation {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
	String[] news=s.split(" ");
	char[] c1= {};
	System.out.println("length after split"+news.length);
	for(int i=0;i<news.length;i++) {
		String c=news[i];
		
	 char[] s2=swap(c);
	 System.out.print(String.copyValueOf(s2)+":0 ");
	
	
			
			
		
		}
		
		
	}

	public static char[] swap(String c) {
		char[] c1=c.toCharArray();
	
			
				char temp=c1[0];
				c1[0]=c1[c1.length-1]; 
				c1[c1.length-1]=temp;
				 
		
	
			return c1;
	
	
	
}}
