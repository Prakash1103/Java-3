package week1day3assignments;

public class FibonacciSeries {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8,firstNum=0,secondNum=1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i = 1; i<=6; i++) {
			int sum= firstNum + secondNum;
		    firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum+ "  ");
					
			
		}
    
	}

}
