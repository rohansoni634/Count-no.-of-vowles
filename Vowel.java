package countNumberOfVowels;
import java.util.Scanner;

class Vowel {
public static void main (String[] args) {
	String s;
	int counter=0;
	int space=0;
	System.out.println("Eneter String: ");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
			counter++;
		}
		else if(ch==' ') {
			space++;
		}
	}
	System.out.println(counter);
	System.out.println(space);


	}
}
