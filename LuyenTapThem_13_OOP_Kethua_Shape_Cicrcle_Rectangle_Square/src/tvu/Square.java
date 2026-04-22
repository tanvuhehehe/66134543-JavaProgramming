package tvu;

public class Square extends Rectangle{
	//constructor
	public Square() {
		
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	public double getSide() {
		return getLength();
	}
	public void setSide(double side) {
		this.setLength(side);
		this.setWidth(side);
	}
	 public void setWidth(double side) {
	        super.setWidth(side);
	        super.setLength(side);
	    }

	    @Override
	    public void setLength(double side) {
	        super.setWidth(side);
	        super.setLength(side);
	    }
	    @Override
	    public String toString() {
	        return "Square[" + super.toString() + "]";
	    }
}	
