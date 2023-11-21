package com.demo.test;

import java.util.Scanner;

public class SearchData {
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("eneter the number:" +(i+1));
			arr[i]=sc.nextInt();
		}
	}
	public static int LinearSearch(int[] arr, int search) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==search) {
					return i;
				}
			}
			return -1;
	}
	public static int BinarySearch(int[] arr, int search) {
		int first=0;
		int last=arr.length-1;
		int cnt=0;
		while(first<=last) {
			int mid=(first+last)/2;
			cnt++;
			if(arr[mid]==search) {
				System.out.println("Comparison are "+cnt);
				return mid;
			}
			else if(arr[mid]<search) {
				first=mid+1;
				
			}
			else {
				last=mid-1;
			}
			
		}
		System.out.println("Comparison are "+cnt);
		return -1;
	}
	private static int BinarySearchRecursive(int first, int last, int search, int[] arr) {
	if(first>last) {
		return -1;
	}
	else {
		int mid=(first+last)/2;
		if(arr[mid]==search) {
			return mid;
		}
		else if(arr[mid]<search){
			System.out.println(first+", "+last+" ,"+mid+", "+search);
			return BinarySearchRecursive(mid+1,last,search,arr);
			
		}
		else {
			System.out.println(first+", "+last+" ,"+mid+", "+search);
			return BinarySearchRecursive(first,mid-1,search,arr);
		}
	}
	}
	
	public static void main(String[] args) {
		int n=6;
		int []arr=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Accept the data for array");
		acceptData(arr);
		System.out.println("Enter the number for search");
	   int search=sc.nextInt();
//	   int pos=LinearSearch(arr,search); linear search
	  // int pos=BinarySearch(arr,search);
	  // System.out.println("No. found at "+pos);
	 //  int pos=BinarySearchRecursive(0,arr.length-1,search,arr);
	  // System.out.println("No. found at "+pos);
	   
	}
	
	
	
}
