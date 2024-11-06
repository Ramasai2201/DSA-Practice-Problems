import java.util.Scanner;
public class Number {
     static int PerfectNumber(int n) {
		int sum=0;
	    int i;
	    for(i=1;i<n;i++) {
	    	if(n%i==0) {
	    		sum= sum + i;
	    	}
	    }
	    return sum;
	}
	    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the Number N :");
		  int n=scan.nextInt();
		  int total = PerfectNumber(n);
		  if(total == n) 
      {
			System.out.println("True");
		  }
		 else 
      {
		 System.out.println("False");
		  }
	}
}
