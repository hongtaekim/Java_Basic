
public class maximum_value {
	public static void main(String[] args) {
		//1차원 배열에서 최대값 구하기
		int arr3[] = {1, 9, 15, 7, 8};
		System.out.println("최대값을 계산하시오");
		int max = arr3[0];
		
		for( int i =0; i < arr3.length; i++ )
		{
			if( max < arr3[i] )
			{
				max = arr3[i];
			}
			
		}
		System.out.println("최대값은 "+ max+ "입니다.");
		
		//음수일때 1차원 배열에서 최대값 구하기
		int arr4[] = {-17, -2, -3, -1};
		int max_a = arr3[0];
		
		for(int i = 0; i < arr4.length; i++)
		{
			if( max_a < arr4[i] ) {
				max_a = arr4[i];
			}
		}
		System.out.println("음수의 최대값은 "+ max_a+"입니다.");
	}
}
