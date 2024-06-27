package homeAssignWeek1Day2;

public class FibonacciNumber {
	public static void main(String[] args) {
	int FirstNumber=0,SecondNumber=1,NextNumber;
	System.out.println(FirstNumber +"\n"+SecondNumber);
		for (int i=2; i< 7;i++) {
		NextNumber=FirstNumber+SecondNumber;
		System.out.println(NextNumber);
		FirstNumber=SecondNumber;
		SecondNumber=NextNumber;	
	}
	}
}
