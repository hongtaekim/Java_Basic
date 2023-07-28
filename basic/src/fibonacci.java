
public class fibonacci {

	public static void main(String[] args) {
		//피보나치 수열
		int num1 = 1;
		int num2 = 0;
		
		for(int i = 0; i<10; i++)
		{
			int temp = num1 + num2;
			num2 = num1;
			num1 = temp;
			System.out.print(temp+", ");
		}

	}

}
