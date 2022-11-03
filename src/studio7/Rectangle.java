package studio7;

public class Rectangle {
	
	private int length = 0;
	private int width = 0;
	
	public Rectangle(int initLength, int initWidth)
    {
       length = initLength;
       width = initWidth;
    }
	

	public int Area() {
		return length * width;
	}
	
	public int Perimeter() {
		return 2*length + 2*width;
	}
	
	
	public boolean isSquare() {
		
		if(length == width) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isBigger(Rectangle A) {
		return (this.Area() > A.Area());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(6,7);
		Rectangle r2 = new Rectangle(4,3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r2.Area());
		System.out.println(r2.isBigger(r1));
		
		
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	

}
