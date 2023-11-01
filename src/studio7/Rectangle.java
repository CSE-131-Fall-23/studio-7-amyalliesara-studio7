package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int initLength, int initWidth)
	{
		length = initLength;
		width = initWidth;
	}
	
	public int area()
	{
		return length*width;
	}
	
	public int perimeter()
	{
		return ((length*2)+(width*2));
	}
	
	public boolean square()
	{
		return length==width;
	}


public static void main(String[] args)
{
	Rectangle rectangle = new Rectangle(3,5);
	System.out.println(rectangle.area());
	System.out.println(rectangle.perimeter());
	System.out.println(rectangle.square());
}
}
