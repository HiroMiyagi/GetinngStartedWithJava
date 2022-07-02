package chapter5;

public class Practice5_1 {

	public static void main(String[] args) {
		
		introduceOnself();
	}

	public static void introduceOnself() {
		String name = "Miyagi";
		int age = 28;
		float height = 183.1F;
		char zodiac = '戌';
		
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("干支は" + zodiac + "年です。");
	}
}
