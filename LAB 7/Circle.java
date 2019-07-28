//class diagram:1

class Circle
{
private double radius;
private String color;
final double PI=3.14;
	public Circle()
		{
		radius=1.0;
		color="red";
		}
		public Circle(double radius)
		{
		this.radius=radius;
		}
		public Circle(double radius, String color)
		{
		this.radius=radius;
		this.color=color;
		}
		public double getRadius()
		{
		return radius;
		}
		public void setRadius(double radius)
		{
		this.radius=radius;
		}
		public String getColor()
		{
		return color;
		}
		public void setColor(String color)
		{
		this.color=color;
		}
		public double getArea()
		{
		return (PI*radius*radius); 
		}
		public String toString()
		{
		return "Circle[radius= " + radius +",color= "+ color + "]"; 
		}
}
class Cylinder extends Circle
{
private double height;
	public Cylinder()
		{
		super(1.0);
		}
		public Cylinder(double radius)
		{
			super(radius);
		}
		public Cylinder(double radius, double height)
		{
		super(radius);
		this.height=height;
		}
		public Cylinder(double radius, double height,String color)
		{
		super(radius,color);
		this.height=height;
		}
		public double getHeight()
		{
		return height;
		}
		public void setHeight(double height)
		{
		this.height=height;
		}
		public double getVolume()
		{
		return (PI*getRadius()*getRadius()*height);
		}
}
class AreaVolume
{
		public static void main(String args[])
		{
		Cylinder c1=new Cylinder(6.0,3.0);
		double vol=c1.getVolume();
		c1.setRadius(6.0);
		System.out.println("Area of circle is= "+  c1.getArea());
		System.out.println(c1.toString());
		System.out.println("volume of cylinder is= "+ vol);
		}
}