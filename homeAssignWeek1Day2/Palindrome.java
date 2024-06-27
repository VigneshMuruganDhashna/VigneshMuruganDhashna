package homeAssignWeek1Day2;

public class Palindrome {
public static void main(String[] args) {
	int palindrome=1223322,r=0;
	for (int p=palindrome;p!=0;p =p/10) {
		int reminder=p%10;
		r=r*10+reminder;
	}
	if(r==palindrome)
{System.out.println("palindrome");
}
	else
	System.out.println("not a Palindrome");}
}
