package extra_activity;

public class areaof_circleusingmethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaof_circleusingmethode n1=new areaof_circleusingmethode();
		n1.area(3.14,5);
		n1.area(3.14,6);
		System.out.println(n1.area(3.14,5));//for return value print in syso
	}
	 double area(double pi,double r) {
		//pi=3.14;
		//r=5;
		double area=pi*r*r;
		System.out.println("area of circle:"+area);
			return area+100;	
	}
}
