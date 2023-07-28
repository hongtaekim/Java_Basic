
public class sequence {

	public static void main(String[] args) {
		//피보나치 수열
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
		
		int bbNum = 1; //전전수
		int bNum = 0; //전수

		
		
		
		//전수를 전전수에 넣고
		//전수에 현재수를 대입한다.
		int i = 1;
		
		while(i <= 20){
			int cNum = bbNum + bNum;
			bbNum = bNum;
			bNum = cNum;
			i++;
			System.out.print(cNum + " ,");
		}
	
		
		
		
		
		

	}

}
