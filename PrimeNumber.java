package week1day3assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		int count=0;
		for (int i = 1; i<=a; i++) {
			if(a%i==0) {
			count++;
			}
			
		}
       if(count==2) {
    	   System.out.println(a + " Prime");
       }
       else {
    	   System.out.println(a+"not a Prime");
       }
	}

}
