package part01.sec01.exam01;

public class Ex07_10 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=100;i++) {
			if(i%3==0) //3의배수일때 
				continue; //계속하라뜻 ==> 밑으로내려가지말고 반복문으로 계속 (제외할때 사용)
			
			hap+=i;
			
		}
		System.out.printf("1~100까지의 합(3의 배수 제외):%d\n",hap);
	}

}
