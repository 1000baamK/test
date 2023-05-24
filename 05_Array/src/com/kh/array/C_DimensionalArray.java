package com.kh.array;

public class C_DimensionalArray {
	
	//이차원 배열 : 일차원 배열 여러개를 하나로 묶은 형태
	public void method1() {
		//일차원 배열 선언
//		int arr[];
//		int[] arr;
		
		//일차원 배열 할당
//		arr = new int[3];
		
		//일차원 배열 선언 및 할당 그리고 초기화
//		int[] arr = new int[3];
//		int arr[] = {1,2,3};
		
		/*
		 * 이차원 배열
		 *  [표현법]
		 * 1. 자료형[][] 배열명;
		 * 2. 자료형[] 배열명[];
		 * 3. 자료형 배열명[][];
		 * 
		 * 보편적으로는 1번 유형으로 작성한다.
		 * 
		 * 이차원배열의 할당 - 배열크기 지정 - 행크기, 열크기
		 *  [표현법]
		 * 배열이름 = new 자료형[행][열];
		 * 
		 * 이차원 배열의 선언 및 할당 그리고 초기화
		 * 자료형[][] 배열명  = new 자료형[행크기][열크기];
		 * 자료형[][] 배열명 = {{1,2,3},{1,2,3},{1,2,3}};
		 * 
 		 */
		
		int arr1[][];
		int[] arr2[];
		int[][] arr3; // 자주 사용하는 방법
		
		arr3 = new int[3][3]; // 3행 3열 이차원배열 할당
		
		System.out.println(arr3); // [[I@6d06d69c
		System.out.println(arr3[0]); //[I@7852e922
		System.out.println(arr3[0][0]); // 0
		
		//3행 5열 정수형 이차원 배열을 만들어라.
		int[][] arr = new int[3][5];
		System.out.println("arr의 길이 : "+arr.length);  // 3
		System.out.println("arr[0]의 길이 : "+arr[0].length); // 5
		System.out.println("arr[1]의 길이 : "+arr[1].length); // 5
		System.out.println("arr[2]의 길이 : "+arr[2].length); // 5
		
		System.out.println("========반복문 활용========");
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]의 길이 : "+arr[i].length);
		}
		
		// 바깥쪽 for문은  - 행의 대하여 길이지정 - 몇줄이 반복될것인지.
		for(int i=0; i<arr.length; i++) {
			// 안쪽 for문은 - 열에 대하여 길이지정 - 몇칸 반복될 것인지.
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//2차원 배열 arr에 각 인덱스에 접근하려면? 3,5
//		arr[0], arr[1], arr[2]
		
//		arr[0][0], arr[0][1], arr[0][2], arr[0][3], arr[0][4]
//		arr[1][0], arr[1][1], arr[1][2], arr[1][3], arr[1][4]
//		arr[2][0], arr[2][1], arr[2][2], arr[2][3], arr[2][4]
		
		// 2행 4열짜리 2차원 배열 선언 및 할당
		int[][] a = new int[2][4];
		System.out.println("=================");
		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i][0]);
//			System.out.println(a[i][1]);
//			System.out.println(a[i][2]);
//			System.out.println(a[i][3]);  이 대신에 중첩 포문을 이용해서 한번에 출력하기
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void method2() {
		//반복문으로 이차원배열에 순서대로 값을 넣어보자.
		//3행 5열짜리 2차원 배열을 생성하여
		//1~15까지의 수를 차례대로 넣고 출력해보시오.
		
		int[][] arr = new int[3][5];
		int value = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}	
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method3() {
		//2차원 배열 3행 3열 짜리를 선언과 동시에 초기화 하여 1~9까지 수를 넣고
		//반복문으로 출력해보세요
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method4() {
		/*
		 * 다음 성적 정보를 저장하고 문제를 푸세요
		 * 1반 : [50, 75, 90, 40, 80]
		 * 2반 : [66, 70, 55, 85, 70]
		 * 3반 : [60, 50, 80, 90, 95]
		 * 반 학생들의 성적을 있는 그대로 화면에 출력
		 * 각 반 학생들의 성적 평균을 구하여 화면에 출력
		 * 72점인 학생의 전체 석차를 출력
		 */
		int[][] score = {{50,75,90,40,80},{66,70,55,85,70,},{60,50,80,90,95}};
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method4_1() {
		
		int[][] score = {{50,75,90,40,80},{66,70,55,85,70,},{60,50,80,90,95}};
		// 반 합계 초기화
		int sum = 0;
		//반의 학생수만큼 반복하기 = 학생의 점수들을 전부 더하기 위해서
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.println((i+1)+"반 평균 : "+(double)sum/5);
			sum = 0;
		}
	}
	
	
	public void method4_2() {
		// 중첩 반복문을 이용하고 합계와 평균도 배열을 이용해보기
		int[][] score = {{50,75,90,40,80}
						,{66,70,55,85,70,}
						,{60,50,80,90,95}};
		
		//각 반의 합계를 담을 배열
		int[] total = new int[score.length];  // 행 길이 넣기
		
		//각 반의 평균을 담을 배열
		double[] avg = new double[score.length];  // 행 길이 넣기
		
		//계산
		for(int i=0; i<score.length; i++) { // 0 1 2
			for(int j=0; j<score[i].length; j++) { // 0 1 2 3 4
				total[i] += score[i][j]; //total 배열 i번째에 score[i][j]를 다 더해 넣는작업
			}
			avg[i] = (double)total[i]/score[i].length;
		}
		
		//출력
		for(int i=0; i<score.length; i++) { // 0 1 2
			System.out.print((i+1)+"반 평균 : "+avg[i]+" ");
		}
		System.out.println();
		//각 반 점수 출력
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public void method4_3() {
		int[][] score = {{50,75,90,40,80},
						{66,70,55,85,70,},
						{60,50,80,90,95}};
		//72점의 전체 예상 등수를 구해보자.
		int myScore = 72;
		int rank = 1;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				if(myScore<score[i][j]) { //만약 나보다 점수가 높다면
					rank++;
				}
			}
		}
		System.out.println("72점인 학생의 석차는 "+rank+"등 입니다.");
		
	}
	
	public void method5() {
		/*
		 * 가변배열
		 * 행의 크기를 정해놓고 각각의 행 별로 열의 크기를 정해놓지 않은 상태
		 * 이차원 배열 == 일차원 배열을 묶은 형태
		 * 이때 묶여있는 일차원 배열들이 꼭 같은 크기일 필요는 없다.
		 * 행의 크기는 생략할 수 없음, 열의 크기는 생략가능
		 * 열의 크기만 변경이 가능하다
		 * 
		 * [표현법]
		 * int[][] arr = new int[행크기][];
		 * 
		 */
		
		
		int[] arr2 = new int[3];
		String[] sArr = new String[3];
		
		System.out.println(sArr);  // [Ljava.lang.String;@6d06d69c
		System.out.println(sArr[0]);  // null
		
		System.out.println(arr2);  // [I@4e25154f
		System.out.println(arr2[0]);  // 0
		
		double[] dArr = new double[3];
		System.out.println(dArr);  // [D@70dea4e
		System.out.println(dArr[0]);  // 0.0
		
		boolean[] bArr = new boolean[3];
		System.out.println(bArr);  // [Z@5c647e05
		System.out.println(bArr[0]);  // false
		
		
		
		int[][] arr = new int[3][]; //행의 크기를 3으로
		
		System.out.println(arr); // [[I@6d06d69c
		System.out.println(arr[0]); // null - 참조자료형의 기본값 : 아무것도 참조하고 있지 않은 상태를 의미하는 값
		System.out.println(arr.length); // 3
		
//		아직 행별로 열의 칸이 정해지지 않은 아무것도 참조하고 있지 않은 상태이기 때문에 length를 알수 없다.
//		NullPointerException
//		System.out.println(arr[0].length);
		
		//각 행마다 열의 크기를 정해보자
		arr[0] = new int[5];//5칸짜리 배열
		arr[1] = new int[3];//3칸짜리 배열
		arr[2] = new int[2];//2칸짜리 배열
		
		//값 출력
		System.out.print(arr[0][0]+" ");
		System.out.print(arr[0][1]+" ");
		System.out.print(arr[0][2]+" ");
		System.out.print(arr[0][3]+" ");
		System.out.println(arr[0][4]);
		
		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
		System.out.println(arr[1][2]);
		
		System.out.print(arr[2][0]+" ");
		System.out.println(arr[2][1]+" ");
		
		//값 대입
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 5;
			}
		}
		
		
		//반복문을 이용하여 값 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//이차원 가변배열을 만들고 순차적으로 1부터 값을 넣어서 출력해주세요
		
		int[][] iArr = new int[3][];
		
		iArr[0] = new int[2];
		iArr[1] = new int[4];
		iArr[2] = new int[3];
		int cnt = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = cnt++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//가변배열을 사용하는 이유 -
		//메모리 공간응ㄹ 효율적으로 사용하기 위해.
		
		
		
		
		
		
		
		
		
	}
}
