package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		
		 @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		  int a,b;
		  char ch;
		  
		  while(true) {
			  System.out.print("ù��° �� �Է�:");
        	  a=s.nextInt();
        	  System.out.print("�ι�° �� �Է�:");
        	  b=s.nextInt();
        	  System.out.print("����� �����ڸ� �Է��ϼ���");
        	  
        	  ch=(char)System.in.read();//���� �ϳ��� �д´� (���������� ���������� ó����)
        	  
        	  switch(ch) {
        	  case '+'://<==�ü��մ°� : ������,���ڿ�  (�Ǽ����� �ȵ�)
        		  System.out.printf("%d+%d=%d\n",a,b,a+b);
        		  break;
        	  case '-':
        		  System.out.printf("%d-%d=%d\n",a,b,a-b);
        		  break;
        	  case '*':
        		  System.out.printf("%d*%d=%d\n",a,b,a*b);
        		  break;
        	  case '/':
        		  System.out.printf("%d/%d=%d\n",a,b,a/b);
        		  break;
        	  case '%':
        		  System.out.printf("%d%%%d=%d\n",a,b,a%b);
        		  break;
        	  default:
        		  System.out.printf("�����ڸ� �� �� �Է��߽��ϴ�.\n");
        	  }
        	 
        	  
        	  
		  }
		

	}

}