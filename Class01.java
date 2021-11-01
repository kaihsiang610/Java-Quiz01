class Cal_area{
	int radius;
	int length;
	int width;
	int height;
	double pi = 3.14159;
	
	void setR(int r) {
		radius = r;
	}
	
	void setL(int l) {
		length = l;
	}
	
	void setW(int w) {
		width = w;
	}
	
	void setH(int h) {
		height = h;
	}
	
	void show() {
		System.out.println("Spherical volume=" + 4.0/3.0*pi*radius*radius*radius);
		System.out.println("Cube surface area=" + (length*width+length*height+width*height)*2);
	}
}

public class Class01 {

	public static void main(String[] args) {
		Cal_area cal = new Cal_area();
		cal.setL(4);
		cal.setW(5);
		cal.setH(6);
		cal.setR(10);
		cal.show();
	}

}
