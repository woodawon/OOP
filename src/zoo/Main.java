package zoo;

public class Main {
	
	// 핵심 코어 Main 클래스
	
	public static void main(String[] args) {
		
		// 인스턴스 선언
		Meat meat = new Meat();
		Greens gr = new Greens();
		
		// 공격 함수 실행
		meat.attack(meat.Lion, gr.Rabbit);
		meat.attack(meat.Lion, gr.Rabbit);
		meat.attack(meat.Lion, gr.Rabbit);
		meat.attack(meat.Lion, gr.Rabbit);
		meat.attack(meat.Lion, gr.Rabbit);
		
		
	}

}
