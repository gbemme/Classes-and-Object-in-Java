package exercise9_8;
import java.math.*;
public class Quadrilateral {
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	private double area;
	private double distance1;
	private double distance2;
	
	public Quadrilateral(Point point1,Point point2,Point point3,Point point4) {
		this.point1=point1;
		this.point2=point2;
		this.point3=point3;
		this.point4=point4;
	}
	
	public double getDistance1() {
		return distance1;
	}

	public double getDistance2() {
		return distance2;
	}

	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public Point getPoint4() {
		return point4;
	}
	public void setPoint4(Point point4) {
		this.point4 = point4;
	}
	
	public double calDistance1() {
		return distance1 =Math.sqrt(Math.pow(point1.getX()-point2.getX(),2)+Math.pow(point1.getY()-point2.getY(),2));
		
	}
	
	public double calDistance2() {
		return distance2 =Math.sqrt(Math.pow(point1.getX()-point4.getX(),2)+Math.pow(point1.getY()-point4.getY(),2));
		
	}
	

public double calArea() {
	
	return area;
}
	
	

}
