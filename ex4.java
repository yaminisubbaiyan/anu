package string;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b,c = "";
		int l1,y=0,i,x=0,d=0;
		Scanner in=new Scanner(System.in);
		a=in.next();
		b=in.next();
		String a1=a.toUpperCase();
		String b1=b.toUpperCase();
		int l=a1.length();
		String str[]=new String[100];
		String ah[]=b1.split(":");
		int len=ah.length;
		for(i=0;i<len;i++){//Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer
		l1=ah[i].length();
		if(l==l1){
if((a1.substring(0,2).equals(ah[i].substring(0,2)))&&(a1.substring(l1-2,l1).equals(ah[i].substring(l1-2,l1)))){
str[y]=ah[i];
		y++;
	}
		}
		}
		if(y!=0){
		for(i=0;i<=y-2;i++){
		System.out.print(str[i]+":");
		}
		System.out.println(str[y-1]);
		}
		else
			System.out.println("error");
     }
  }


