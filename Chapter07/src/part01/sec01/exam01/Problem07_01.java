package part01.sec01.exam01;

import java.util.Scanner;
//미완성
public class Problem07_01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	    int start,end;
	    int basu,i;
	    int hap=0;
	    
	 
	    System.out.print("합계의 시작값==>");
	    start=s.nextInt();
	    System.out.print("합계의 끝값==>");
	    end=s.nextInt();
	    System.out.print("배수 ==>");
	    basu=s.nextInt();	    	   	    	
	    
	    i=start;//
	    
	    while(i<=end) {
	    	
	    	if(i % basu==0) {
	    		hap=start+i;
	    	}	
	            i++;	    
	        	    	
	          }
	  
	    System.out.printf("%d부터 %d까지의 %d배수의 합계==>%d\n",start,end,basu,hap);
	    
	    s.close();
	    }
   }   
	    
	   
         
	 
	


