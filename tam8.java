import java.util.Scanner;

public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner in=new Scanner(System.in);
		s=in.next();
		StringBuilder s1=new StringBuilder(s);
		s1.reverse();
		String rev=s1.toString();
		if(rev.equals(s)){
			System.out.println("palin");
		}
		else{
			System.out.println("not palin");
		}
			}

		}
	


