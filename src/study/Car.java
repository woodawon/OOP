package study;

public class Car {
	
	String car1 = "모닝";
	String car2 = "벤츠";
	String car3 = "포르쉐";
	
	void printCarName() { // Car 클래스 안에 있는 모든 car변수의 값들을 출력하는 메서드
		System.out.println("모든 자동차들의 이름을 출력합니다.");
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
	
	void reNameCar(String re1, String re2, String re3) { // Car 클래스 안에 있는 car변수의 값을 변경하는 메서드
		this.car1 = re1;
		this.car2 = re2;
		this.car3 = re3;
		System.out.println("자동차 이름들이 싹다 바뀌었습니다.");
	}
}
