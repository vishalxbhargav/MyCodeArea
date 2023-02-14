package Recursion;

import java.util.Arrays;

public class RemoveDuplicateByusingRecursion{
	public static void removeDuplicate(String str,StringBuilder sb,boolean[] nums){
		if(str.length()==0){
			return;
		}
		char ch=str.charAt(0);
		int ch1=ch-'a';
		if(nums[ch1]==false){
			sb.append(ch);
			nums[ch1]=true;
		}
		str=str.substring(1);
		removeDuplicate(str, sb, nums);
	}
	public static void main(String[] args) {
		String str="aappnnaaccollegge";
		StringBuilder sb=new StringBuilder();
		sb.append(" ");	
		boolean nums[]=new boolean[26];
		Arrays.fill(nums,false);
		removeDuplicate(str,sb, nums);
		System.out.println(sb);
	}
}
