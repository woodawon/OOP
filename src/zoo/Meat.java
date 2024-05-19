package zoo;

public class Meat {

	// 먹이 종류, 동물 이름 종류, 육초식 구분 태그
	// <먹이 종류> 0 : 소고기 / 1 : 양고기
	// <구분 태그> 0 : 육식 / 1 : 초식
	// [조건] 같은 육식끼리는 공격하지 않는다.
	// 먹이 종류, 이름, 구분태그, 데미지
	
	String[] Lion = { "0", "사자", "0", "0" };
	String[] Tiger = { "1", "호랑이", "0", "0" };
	
	void attack(String[] name1, String[] name2) { // name1 이 name2를 공격하는 함수
		System.out.println(name1[1] + " 동물이 " + name2[1] + " 동물을 공격합니다!");
		int num = Integer.parseInt(name2[3]) + 1;
		name2[3] = num + "";
		System.out.println("현재 데미지 상태 : " + name1[1] + " : " + name1[3] + " / " + name2[1] + " : " + name2[3] + " 입니다.");
	}

}
