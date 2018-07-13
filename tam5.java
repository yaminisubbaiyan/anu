import java.util.Scanner;
public class nk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int a;
int i;
Scanner in=new Scanner(System.in);
n=in.nextInt();
a=in.nextInt();
int sum=0;
int b[]=new int[n];
for(i=0;i<n;i++){
	b[i]=in.nextInt();
}
for(i=0;i<a;i++){
	sum=sum+b[i];
}
System.out.println(sum);
	}

}
