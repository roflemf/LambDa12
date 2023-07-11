/* 매개변수와 리턴타입이 없는 함수형 인터페이스 정의
 * 
 * @FunctionalInterface 의 특징)
 *  1. 자바8 부터는 @FunctionalInterface를 사용해서 함수형 인터페이스를 정의할 수 있다.
 *  2. 함수형 인터페이스는 오직 추상메서드가 하나만 올 수 있고, 하나의 추상메서드는 꼭 정의해야 한다.
 *  3. 함수형 인터페이스는 람다식 타켓 타입으로 사용하기 위한 인터페이스이다.
 *     즉, 함수형 인터페이스는 람다식을 위한 인터페이스
 *     추상메서드를 둘 이상 정의하면 컴파일 에러가 발생
 *  
 */


@FunctionalInterface
public interface MyFun {
	
	public void method();
	//abstract가 생략된 추상메서드 
	//(추상메서드 하나만 가능하므로, 하나 더 추가시 에러남)
}
