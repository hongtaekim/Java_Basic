
public class lotto {

	public static void main(String[] args) {
		// TODO 로또의 6자리 구하기 단 중복값은 없애기
		int lotto[] = new int[6];
		
		//
			
		
		for(int i=0; i < 6; i++)
		{
			lotto[i] = (int)(Math.random() * 45 + 1);
			//중복값 없애기
			//만일 로또에서 6자리를 출력했는데
			//1, 13, 4, 1, 7, 45
			//처럼 나오게 되면 안된다 때문에 처음부터 다시 검증하는 작업이 필요하다.
			
			for(int j=0; j < lotto.length; j++)
			if( lotto[i] == lotto[j] )
			{
				i--;  
				// i--을 해주는 이유는 해당 자리에 이미 값이 들어갔음으로
				//다시 이전의 index를 가리켜 Math.random을 통해 값을 저장한다.
				break;
				//break; 문을 통해 가장 안쪽의 for문을 나오게 되며 바깥쪽의 증감식으로 이동한다.
			}
			
		}
		
		
	}

}
