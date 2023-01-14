package InterfaceEx21;

class Rectangle implements Polygon{
	
	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("the area of the rectangle is"+(length*breadth));
	}

}
    class InterfaceEx2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Rectangle r=new Rectangle();
    r.getArea(5, 6);
	}
    }
	

	