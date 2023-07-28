
public class appearances {

	public static void main(String[] args) {
		int arr1[] = {1,10,6,3,2,3,6,1,5,7,6,5};
		int arr2[] = new int[10]; //1부터 10까지 숫자의 출현 횟수를 저장할 1차원 배열 공간
		
		//1는 0의 자리에서 출현 횟수를 샐꺼고
		//2는 1의 자리에서 출현 횟수를 샐꺼고
		//3는 2의 index에서 출현 횟수를 샐꺼다.
		//때문에 숫자의 자리에 따라 숫자의 출현 횟수를 세면 되는 알고리즘이다.
		
		System.out.println("숫자의 출현횟수를 출력하시오");
		
		for(int i = 1; i < 10; i++)
		{
			arr2[ arr1[i]-1 ]++;
			//arr1[]이 arr2의 index 공간을 찾아주면서 해당하는 숫자가 arr1의 값으로 나타나면 1을 뺴
			//arr2[index]자리의 값을 1 올려주면 숫자의 출현 횟수가 나오게 되는 것이다.
		}
		
		//향상된 for문으로 값을 대입할 수 있다.
		
//		for (int value : arr2) {
//			arr2[ arr1[value -1 ] ]++;
//		}
		
		//숫자의 출현 횟수를 출력해보자
		
		for(int i=0; i<10; i++)
		{
			System.out.println((i+1)+"의 출현 횟수"+ arr2[i]+"회");
		}

	}

}
