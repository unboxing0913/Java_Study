package part01.sec02.exam08;

public class MethodExample_4 {

	public static void main(String[] args) {
		
		printCharacter('*',30);
		System.out.println("Hello, Java");
		printCharacter('-',30);
		
		
	}

	static void printCharacter(char ch,int num) {
		for(int cnt=0;cnt<num;cnt++) {
			System.out.print(ch);
		 }
		System.out.println();
		
	}
}
