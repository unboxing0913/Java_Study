package part01.sec02.exam08;

public class Imsi {

	public static void main(String[] args) {
		Employer_6 emr = new Employer_6(3000);
		Employee_6 eme = new Employee_6(0);
		
		//�����ִ�����
		//������ �������ִ°�
		//������ �������ִ°�
		
		emr.payForWork(eme,1000);
		eme.earnMoney(1000);
		emr.showMoney();
		eme.showMyMoney();
	
	}

}