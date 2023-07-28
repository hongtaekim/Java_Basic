import java.util.Iterator;

public class year {

	public static void main(String[] args) {
		
		
		int arr1[] = {1,10,6,3,2,3,6,1,5,7,6,5};
		int arr2[] = new int[10];
		
		System.out.println("숫자의 출현횟수를 출력하시오");
		
		arr2[ arr1[0]-1 ]++;
		arr2[arr1[1]-1]++;
		arr2[arr[2]-1]++;
		
		for(int i=0; i<arr1.length; i++) {
			arr2[ arr1[i]-1 ]++;
		}
		
		for (int value : arr1) {
			arr2[ arr1[value]-1 ]++;
		}
		
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println( (i+1)+"의 출현횟수-"+arr2[i] + "회" );
		}

		int arr3[] = {-1, -2, -3};
		System.out.println("최대값을 계산하시오");

		int max = arr3[0];
		for(int i = 1; i < arr3.length; i++)
		{
			if(max <= arr3[i])
				max = arr3[i];
		}
		System.out.println("최대값은 "+ max+"입니다.");
		
		int arr4[] = {5,4,7,1,2};
		오름차순 정렬
		내림차순 정렬
		정렬 종류 정렬 방법 공부해오기
		선택, 버블, 등등 구현 해보기
		
		
		for (int i = 0; i <= arr4.length; i++) {
			
			if(arr4[i] > arr4[i+1]) {
				
			}
		}
		
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 +1);
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
			
		}
		중복을 제거할 필요가 있습니다.
		for (int i : lotto) {
			System.out.print(i+", ");
		}
		
		
		
		int arrTwo3[][]; 선언
		arrTwo3 = new int[5][];
		행별 열수는 다르게 합시다.
		 1 , 2, 3, 4, 5 열의 수는 1부터 5까지 차례대로 증가하도록
		그리고 그 행열에 값이 어떻게 채워지냐면
		
	
	}

}