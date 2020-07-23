package Date2372020;

abstract class Shape {

	String color="red";
	Boolean filled=true;
	
	public Shape() {
		super();
	}
	
	public Shape(String color,Boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	
	abstract double getArea();
	public double area;
	
	public double perimeter;
	abstract double getPerimeter();
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "Color:\t"+color+"\nFilled:\t"+filled+"\nArea:\t"+getArea()+"\nPerimeter:\t"+getPerimeter();
	}
}

class Circle extends Shape{
	double radius=1.0;
	
	public Circle() {
		super();
	}
	
	public Circle(double r) {
		this.radius=r;
	}
	
	public Circle(double r,String color,Boolean filled) {
		super(color,filled);
		this.radius=r;
	}
	
	public double getArea()
	 {
	  area = Math.PI * radius * radius;
	  return area;
	 }
	
	public double getPerimeter() {
		perimeter=2 * Math.PI * radius;
		return perimeter;
	}
	
	public String toString() {
		return "\nArea of Circle:\t"+getArea()+"\nPerimeter of Circle:\t"+getPerimeter()+"\nColor:\t\t"+color+"\nFilled:\t\t"+filled;
	}
}

class Rectangle extends Shape{
	double width=1.0;
	double length=1.0;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double w,double l) {
		this.width=w;
		this.length=l;
	}
	
	public Rectangle(double w,double l,String color,Boolean filled) {
		super(color,filled);
		this.width=w;
		this.length=l;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea()
	 {
	  area = width*length;
	  return area;
	 }
	
	public double getPerimeter() {
		perimeter=2*(width+length);
		return perimeter;
	}
	
	public String toString() {
		return "\nArea of Rectangle:\t"+getArea()+"\nPerimeter of Rectangle:\t"+getPerimeter()+"\nColor:\t\t"+color+"\nFilled:\t\t"+filled;
	}
}

class Square extends Rectangle{
	double side=2;
	public Square() {
		super();
	}
	
	public Square(double side) {
		this.side=side;
	}
	
	public Square(double side,String color,Boolean filled) {
		super();
		this.side=side;
	}
	
	public void setWidth(double w) {
		this.width=w;
	}
	
	public void setLength(double l) {
		this.length=l;
	}
	
	public String toString() {
		return "\nSide:\t"+side+"\nWidth:\t"+width+"\nLength:\t"+length+"\nColor:\t\t"+color+"\nFilled:\t\t"+filled+"\nArea of square:\t"+getArea()+"\nPerimeter of square:\t"+getPerimeter();
	}
}

public class OOPAbstract {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1=new Circle();
		System.out.println(s1.toString());
		
		Shape s2=new Circle(1.5);
		System.out.println(s2.toString());
		
		Shape s3=new Circle(2.5, "green", true);
		System.out.println(s3.toString());
		
		Shape s4=new Rectangle();
		System.out.println(s4.toString());
		
		Shape s5=new Rectangle(4.0, 2.5);
		System.out.println(s5.toString());
		
		Shape s6=new Rectangle(3.5, 2, "blue", false);
		System.out.println(s6.toString());
		
		Shape s7=new Square();
		System.out.println(s7.toString());
		
		Shape s8=new Square(4);
		System.out.println(s8.toString());
		
		Shape s9=new Square(3.5, "Grey", true);
		System.out.println(s9.toString());
	}

}
