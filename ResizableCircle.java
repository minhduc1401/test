package homework;

public class ResizableCircle extends Circle implements Resizable {
	
	
	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void resize(int percent) {
		radius *= percent/100.0;
	}
}

