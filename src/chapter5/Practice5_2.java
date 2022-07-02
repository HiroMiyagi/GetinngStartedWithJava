package chapter5;

class Practice5_2 {

	public static void main(String[] args) {
		email("はじめまして", "test@example.com", "宮城浩克です。");
		email("test@example.com", "宮城浩克です。");
	}
	
	public static void email(String title, String adress, String text) {
		System.out.println(adress + "に以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	public static void email(String adress, String text) {
		System.out.println(adress + "に以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
}
