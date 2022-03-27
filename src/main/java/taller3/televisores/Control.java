package taller3.televisores;

public class Control {
	
	// Attributes
	private TV tv;
	
	// Other methods
	public void turnOn () {
		tv.turnOn();
	}
	public void turnOff () {
		tv.turnOff();
	}
	
	public void canalUp () {
		tv.canalUp();
	}
	public void canalDown () {
		tv.canalDown();
	}
	
	public void volumenUp () {
		tv.volumenUp();
	}
	public void volumenDown () {
		tv.volumenDown();
	}
	
	public void setCanal (int canal) {
		tv.setCanal(canal);
	}
	
	public void enlazar (TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	// Getters & Setters
	public TV getTv () {
		return tv;
	}
	public void setTv (TV tv) {
		this.tv = tv;
	}
	
}
