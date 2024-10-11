package BOONGTOLJAVA;

public class b_5_3_ReferenceVariableCompareExample {
    public static void main(String[] args) {
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2; //배열 변수 arr2 선언
		int[] arr3; //배열 변수 arr3 선언
			
		arr1 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
		arr2 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
		arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입
			
		System.out.println(arr1 == arr2); // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr2 == arr3); // arr2와 arr3 변수가 같은 배열을 참조하는지 검사 (메모리적 사고필수!)
	}
}

// java에서 배열은 객체입니다.
// 자바에서 객체를 만들때는 new 를 사용한다!!!

// int arr1; 는 정수형 자료형을 선언하는것인 반면에, int[] arr1;는 정수를 원소로 갖는 배열 자료형을 선언하는 것이다!
// int arr1[];만으로는 arr1이 배열이라고 할 수 없습니다.
// 배열을 가르키는 변수 , 정수를 가르키는 변수 등 --> when 선언만 했을시!

// System.out.println(arr1 == arr2);와 System.out.println(arr2 == arr3);에서 == 연산자는 배열 변수들이 같은 배열 객체를 참조하고 있는지를 비교합니다.
// 이때 중요한 것은 **배열의 내용이 아닌, 배열 객체의 메모리 주소(참조 값)**를 비교한다는 점입니다.

// Java에서 변수를 선언만 하고 초기화하지 않는 경우에는 변수의 타입과 변수의 위치(로컬 변수, 인스턴스 변수, 클래스 변수)에 따라 그 변수의 초기값이 다르게 설정됩니다.