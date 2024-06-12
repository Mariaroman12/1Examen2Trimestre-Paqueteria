import java.util.ArrayList;

public class Producto {
	
	protected String codProd;
	protected String desc;
	protected int cant;
	protected float peso;
	

	public Producto(String codProd, String desc, int cant, float peso) {
		
		this.codProd = codProd;
		this.desc = desc;
		this.cant = cant;
		this.peso = peso;
		
	}

	public String getCodProd() {
		return codProd;
	}

	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	

}
