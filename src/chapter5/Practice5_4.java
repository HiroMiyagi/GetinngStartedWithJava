package chapter5;

public class Practice5_4 {

	public static void main(String[] args) {
		double botoom_cm = 10.0;
		double height_cm = 5.0;
		double radius_cm = 5.0;
		
		System.out.println("三角形の底辺の長さが" + botoom_cm + "cm、高さが" + height_cm + "の場合、面積は" + calcTriangleAreaCm2(botoom_cm, height_cm) + "cm2");
		System.out.println("円の半径が" + radius_cm + "の場合、面積は" + String.format("%.1f", calcCircleAreaCm2(radius_cm))  + "cm2");
	
	}

	public static double calcTriangleAreaCm2(double bottom_cm, double height_cm) {
		return bottom_cm * height_cm / 2;
	}

	public static double calcCircleAreaCm2(double radius_cm) {
		return radius_cm * radius_cm * Math.PI;
	}

}
