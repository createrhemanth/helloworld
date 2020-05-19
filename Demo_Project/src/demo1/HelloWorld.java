package demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloWorld {
	public static void main(String[] args) {
		int n= 81;
		//System.out.println(Math.sqrt(4));
		for(int i=1;i<=n/2;i++){
			if((i*i)==n){
				System.out.println(i +" is the square root of "+n);
				break;
			}
		}
	}
}
