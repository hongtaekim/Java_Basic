
import java.util.Iterator;

public class ArrayTest {

	public static void main(String[] args) {

		
//		int arr4[] = {5,4,7,1,2};
//		//오름차순 정렬
//		//내림차순 정렬
//		//정렬 종류 정렬 방법 공부해오기
//		//선택, 버블, 등등 구현 해보기
//		
//		
//		for (int i = 0; i <= arr4.length; i++) {
//			
//			if(arr4[i] > arr4[i+1]) {
//				
//			}
//		}
		
//		int lotto[] = new int[6];
//		
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int)(Math.random() * 45 +1);
//			for (int j = 0; j < i; j++) {
//				if(lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//			
//		}
////		for (int i = 0; i < lotto.length; i++) {
////			System.out.println(lotto[i]);
////			
////		}
//		//중복을 제거할 필요가 있습니다.
//		for (int i : lotto) {
//			System.out.print(i+", ");
//		}
//		
		
		
		int arrTwo3[][]; //선언
		arrTwo3 = new int[5][];
		
		//행별 열수는 다르게 합시다.
		// 1 , 2, 3, 4, 5 열의 수는 1부터 5까지 차례대로 증가하도록
		//그리고 그 행열에 값이 어떻게 채워지냐면 onenote 대로 해보자!
		
		arrTwo3[0] = new int[1];
		arrTwo3[1] = new int[2];
		arrTwo3[2] = new int[3];
		arrTwo3[3] = new int[4];
		arrTwo3[4] = new int[5];
		
		for (int i = 0; i < arrTwo3.length; i++) {
			arrTwo3[i] = new int[i+1];
		}
//		arrTwo3[0][ arrTwo3[0].length-1  ] = 1;
//		
//		arrTwo3[1][0] = 1;
//		arrTwo3[1][arrTwo3[1].length-1 ] = 1;
//		
//		arrTwo3[2][0] = 1;
//		arrTwo3[2][arrTwo3[2].length-1 ] = 1;
//		
//		arrTwo3[3][0] = 1;
//		arrTwo3[3][arrTwo3[3].length-1 ] = 1;
//		
//		arrTwo3[4][0] = 1;
//		arrTwo3[4][arrTwo3[4].length-1 ] = 1;
		
		
//		
//		for(int i = 0; i < arrTwo3.length; i++)
//		{
//			arrTwo3[i][0] = 1;
//			int colLength = arrTwo3[i].length;
//			for(int j=1; j<colLength-1; j++)
//			{
//				arrTwo3[i][j] = arrTwo3[i-1][j-1] + arrTwo3[i-1][j];
//			}
//			
//			
//			arrTwo3[i][colLength-1 ] = 1;
//		}
//		
//		
//		for (int[] valueArr : arrTwo3) {
//			for ( int value : valueArr) {
//				System.out.print(value+",");
//			}
//			System.out.println();
//		}
//	}
		
		  String subject[] = {"국어","수학","영어"};
		  int subjectLength = subject.length;
		  
		  
		  int [][]arrTwo4 = new int[10][subjectLength]; //최대 10명의 학생 점수(국어,수학,영어)
	      
	      java.util.Scanner sc = new java.util.Scanner(System.in); 
	      int no = 0;      
	      while(no < 10) {
	         System.out.print("점수입력을 진행하시겠습니까[y/n]");
	         String yn = sc.next();
	         if(yn.equals("n")) {
	            break;
	         }
	         for (int i = 0; i < subjectLength; i++) {
	        	 System.out.print((no+1) + "번 학생의" + subject[i] +"점수:");
	        	 int k = sc.nextInt();
	        	 arrTwo4[no][i] = sc.nextInt();
				
			}
	         no++;
	      }
	      int totalScore;
	      
	      int []totalScoreSubject = new int[subjectLength];//과목별 총점
	      System.out.println("학생들의 점수를 출력하기");
	      
	      for(int i = 0; i <no; i++)
	      {
	    	  System.out.print( (i+1) + "번 학생점수:");
	    	  totalScore = 0;
	    	  for(int j = 0; j<subjectLength; j++) {
	    		  totalScore += arrTwo4[i][j];
	    	  }
	    	   //System.out.println("국어 수학 영어 과목별 성적 출력")
		      for (int j = 0; j < subjectLength; j++){
				System.out.print(subject[j] + "-");
				System.out.println(arrTwo4[i][j]);
			}
		     System.out.println(", 총점-"+totalScore+ ", 평균-"+(float)totalScore/3);
		     
		     //과목별 총점 누적하기
		     for(int j=0; j<subjectLength; j++) {
		    	 totalScoreSubject[j] += a;
		     }
	      }
	      
	   
	      
	      
		//학생들의 점수를 출력하기
	    //1번 학생점수: 국어- 수학- 영어- 총점- 평균-
	    //2번 학생점수: 국어- 수학- 영어- 총점- 평균-
	      /*
	       * 국어과목 평균
	       * 수학과목 평균
	       * 영어과목 평균
	       * */
	      //2차원 배열 학생들의 총점 계산
	      
	      int []total = new int[10];
	      
	      for (int i= 0;  i < arrTwo4.length; i++) {
			for (int j = 0; i < arrTwo4[0].length; j++) {
				total[i] += arrTwo4[i][j]; 
			}
		}
	      
	      
	      int num = 0;
	      //int [][]arrTwo4 = new int[10][3];
	      for (int i = 0; i < arrTwo4.length; i++) {
	    	  System.out.print((num+1) +"번 학생 점수 :");
			for (int j = 0; j < arrTwo4[0].length; j++) {
				if(j == 0) {
					System.out.print("국어- "+ arrTwo4[i][j]);
					continue;
				}
				else if (j == 1) {
					System.out.print("영어- "+ arrTwo4[i][j]);
					continue;
				}
				else if(j==2){
					System.out.print("수학- "+ arrTwo4[i][j]);
					
				}				
			}
		}
	      for (int i = 0; i < total.length; i++) {
			System.out.println("총점- "+total[i]);
		}
	      
	      
	      
	      
	      
	      //교수
	      String []subject = {"국어", "수학", "영어" }; //과목
			int subjectLength = subject.length;//3
			
			int [][]arrTwo4 = new int[10][subjectLength]; //최대10명의 학생점수(국어,수학,영어)
			
			java.util.Scanner sc = new java.util.Scanner(System.in); 
			int no = 0; //학번		
			while(no < 10) {
				System.out.print("점수입력을 진행하시겠습니까[y/n]");
				String yn = sc.next();
				if(yn.equals("n")) {
					break;
				}
				for(int i=0; i<subjectLength; i++) {
					System.out.print((no+1) + "번 학생의 "+ subject[i]+"점수:");
					arrTwo4[no][i] = sc.nextInt();
				}
				no++;
			}
	int []totalScoreSubject = new int[3];//과목별 총점
	      
	      
	      
	      
	      
	int []totalScoreSubject = new int[subjectLength];//과목별 총점
	System.out.println("학생들의 점수를 출력하기");
	for(int i=0; i<no; i++) {
		System.out.print((i+1) + "번 학생점수:");
		totalScore = 0; //학생별 총점
		for(int j=0; j<subjectLength; j++) {
			totalScore += arrTwo4[i][j];
		}
		
		for(int j=0; j<subjectLength; j++) {
			System.out.print(subject[j] + "-");
			System.out.print(arrTwo4[i][j]);
		}
		System.out.println(", 총점-" + totalScore 
				        +", 평균-" + (float)totalScore/3);
		
		//과목별 총점 누적하기
		for(int j=0; j<subjectLength; j++) {
			totalScoreSubject[j] += arrTwo4[i][j]; 
		}
	}
	
	for(int j=0; j<subjectLength; j++) {
		System.out.println(subject[j] + "과목 평균 :" + (float)totalScoreSubject[j]/no);
	}
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
