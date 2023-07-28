
public class twodimensions_Array {

	public static void main(String[] args) {
		// 2차원 배열
		
		int arrtwo[][] = new int[3][2];
		//3행 2열의 2차원 배열을 생성했다.
		
		int rowlength = arrtwo.length;
		//2차원 배열 명으로 배열의 행 수를 계산할 수 있다.
		
		int collength = arrtwo[0].length;
		//2차원 배열의 첫번째 행의 길이로
		//전체 배열의 열수를 계산할 수 있다.
		//단 2차원 배열의 열의 길이가 서로 다를 수 있으니 주의하자
		
		int num = 1;
		for( int row=0; row < 3; row++ )
		{
			for( int col = 0; col < 2; col++, num++)
			{
				arrtwo[row][col] = num;
			}
		}
		
		for(int row = 0; row < 3; row++)
		{
			for( int col = 0; col < 2; col++, num++ )
			{
				System.out.println(arrtwo[row][col] + ", " );
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
