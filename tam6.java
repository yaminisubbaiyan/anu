import java.util.Scanner;
public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int rem=0,c=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
while(n!=0){
	rem=rem%10;
	n=n/10;
	c++;
}
System.out.println(c);
	}

}
