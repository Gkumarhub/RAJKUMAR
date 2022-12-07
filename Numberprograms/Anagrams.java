package com.Strings;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="act";
		String s1="cat";
//		String s2="cat";
		
		
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		//s2=s2.toLowerCase();
		
			if(s.length()!=s1.length()) {
				System.out.println(s+" "+s1+"   are not anagrams");
			}
			else {
				
				char ch[]=s.toCharArray();
				char ch1[]=s1.toCharArray();
				
				Arrays.sort(ch);
				Arrays.sort(ch1);
				if(Arrays.equals(ch,ch1)==true)
				System.out.println(s+" "+s1+"   are   anagrams");
				else
					System.out.println(s+" "+s1+"   are not anagrams");
			}
		}
		

	

}
