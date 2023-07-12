import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest05 {
	static int result =0;
	
	public static void main(String[] args) {
		/* 문제1)
		 * IntStream하위의 rangeClosed(int a, int b)메서드를 활용해서 
		 * 1부터 100까지 순차적으로 제공하는 스트림객체를 생성한 다음 
		 * 해당 자연수의 누적합(1~100까지)을 구해서 출력해 본다. 
		 */
		
		IntStream is = IntStream.rangeClosed(1,100); //1부터 100까지 순차적으로 제공하는 IntStream 생성
		
		is.forEach(value -> result += value); //1부터 100까지의 누적합
		
		System.out.println("1 부터 100까지의 누적합 : " + result);
		
		int total = 0; //누적합
		/* 문제2) 
		 * 일반 for 반복문을 활용해 51부터 100까지의 누적합 구하기
		 */
		
		int total1= 0;//누적합
		for(int i = 51;i<=100;i++) {
			total1 = total1 +i;
		}
		System.out.println("51부터 100까지 누적합 :" + total1);
		
		System.out.println("=====================================");
		
		total = 0;	
		List<Integer> numList = new ArrayList<>();
		/*문제3)
		 * 일반 for 반복문을 1부터 100까지 반복하면서 Math.random()메서드를 활용해 
		 * 1부터 10사이의 임의의 난수를 100번 발생하여 
		 * 컬렉션 numList에 추가한 다음 
		 * 
		 * 난수 누적합을 구해서 출력해보고
		 * numList컬렉션과 향상된 확장 for반복문을 활용해 
		 * 컬렉션 원소의 누적합을 구해 각각 출력.
		 */
		int tt=0;
		
		for(int i=0; i<100; i++) {
			int j = (int)((Math.random()*10)+1); // 0.0~0.9 (*10) -> 0~9 (+1) -> 1~10
			numList.add(j);
			tt += j;
		}
		System.out.println(tt);
		
		int tt2=0;
		for(int i:numList) { //향상된 for문 혹은 for each문
			tt2 += i;
		}
		
		System.out.println(tt2);
		
		
	}

}
