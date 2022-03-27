package taller3.televisores;

public class TV {
	
	// Attributes
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	// Constructor
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	// Getters & Setters
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if (0 <= volumen && volumen <= 7) {
			this.volumen = volumen;
		}
	}

	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (1 <= canal && canal <= 120) {
			this.canal = canal;
		}
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int numTv) {
		TV.numTV = numTv;
	}
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp () {
		if (estado && canal<120) {
			canal++;
		}
	}
	public void canalDown () {
		if (estado && canal>1) {
			canal--;
		}
	}
	
	public void volumenUp () {
		if (estado && volumen<7) {
			volumen++;
		}
	}
	public void volumenDown () {
		if (estado && volumen>0) {
			volumen--;
		}
	}
	
}
