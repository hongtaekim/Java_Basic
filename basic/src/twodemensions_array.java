
public class twodemensions_array {

	public static void main(String[] args) {
		// 행별 열수가 다른 2차원 배열 선언 생성 및 초기화
		
		int arrTwo2[][] = new int[3][];
		//행별 열수를 다르게 설정해 보자
		arrTwo2[0] = new int[1];
		arrTwo2[1] = new int[2];
		arrTwo2[2] = new int[3];
		
		
		//행별 열수 다르게 한 2차원 배열에 값 넣고 출력하기
		int r_num = 1;
		
		for(int i = 0; i<arrTwo2.length; i++)
		{
			for(int j=0; j <arrTwo2[i].length; j++)
			{
				arrTwo2[i][j] = r_num++;
			}
		}
		
		for(int i = 0; i < arrTwo2.length; i++)
		{
			for(int j=0; j < arrTwo2[i].length; j++)
			{
				System.out.print(arrTwo2[i][j]);
				
			}
			System.out.println();
		}
		
		//계단식으로 2차원 배열 내용을 출력하는 것을 볼 수 있다.
		
		
	}

}
