package numbers;
import java.util.*;
public class PrimeinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("enter starting number");
		n1=sc.nextInt();
		System.out.println("enter ending number");
		n2=sc.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
			if( i%j==0) {
			count++;
	
			}
			
			}
			if(count==0) {
				System.out.println(i+" ");
			}
		
		}
		
	}

}
