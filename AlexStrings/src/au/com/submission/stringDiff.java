package au.com.submission;

import java.util.Scanner;

public class stringDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    try {
	        
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		for(int pairsToCompare=0;pairsToCompare<T;pairsToCompare++) {
		    int maxDiff = 0, minDiff = 0;
		   
		    String str1 = sc.next();
		    
		    String str2 = sc.next();
		    for(int i = 0; i < str1.length(); i++){
		        
		        	
		        	if(str1.charAt(i) != str2.charAt(i) ){
		        		
		        		maxDiff++;
		        		
		        		if( str1.charAt(i) != '?' && str2.charAt(i) != '?') {
		        			minDiff++;
		        	
		        		}
		        		
		        		 
		        }	else if(str1.charAt(i) == '?' && str2.charAt(i) == '?') {
		        	maxDiff++;
		        	}
		       
		    }
		    System.out.println(minDiff + " " + maxDiff);
		}
		}catch(Exception e) {
			
	    } finally {
	    	
	    }
	}

	}


