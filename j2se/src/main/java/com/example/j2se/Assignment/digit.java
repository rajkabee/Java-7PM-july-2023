package boot.example.j2se.Assignment;
import java.util.Scanner;
public class digit {

	
		public static void main(String[] args) {
			int num;
			int i;
			Scanner sc=new  Scanner(System.in);
			System.out.println("Enter Number:");
			num=sc.nextInt();
			i=0;
			while(num!=0) {
				num/=10;
				i++;
				
			}
			System.out.println("Number of digit:" +i);
		}
}
