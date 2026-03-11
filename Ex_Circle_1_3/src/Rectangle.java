
public final class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public float getWidth() {
		return width;
	}
	public void setLength(float l) {
		length = l;
	}
	public void setWidth(float w) {
		width = w;
	}
}
