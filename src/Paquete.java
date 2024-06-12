import java.util.ArrayList;

public class Paquete {
	protected String localizador;
	protected String direccion;
	protected String dniC;
	protected String fechaEnvio;
	protected int dias;
	protected String estado;
	private ArrayList < Producto > misProductos ;
	
	
	public Paquete(String localizador, String direccion, String dniC, String fechaEnvio, int dias, String estado) {
		super();
		this.localizador = localizador;
		this.direccion = direccion;
		this.dniC = dniC;
		this.fechaEnvio = fechaEnvio;
		this.dias = dias;
		this.estado = estado;
		misProductos = new ArrayList<>();
	}

	 public boolean addProducto(String codProd, String desc, int cant, float peso){
		 Producto miProducto = new Producto (codProd, desc, cant, peso);
		 for (int i = 0; i < misProductos.size(); i++) {
			 if(misProductos.get(i)==null) {
				 misProductos.add(miProducto);
				 return true;
			 }
				 
			 
		 } 
		 misProductos.add(miProducto);
		    return true;
	 }
	    

	 public boolean borrarProducto(String codProd, String localizador) {
		 for (Producto miProducto: misProductos) {
		     if(miProducto.getCodProd().equals(codProd) ) {
		    	misProductos.remove(miProducto);  
		        return true;
		    	 }
		 }
			 return false;
	 }
	 
	 public String listarProductos() {	
		 String productos="";
		 for(Producto miProducto: misProductos) {
			 productos+="Producto " + miProducto.getCodProd()+ ": " 
					 +"Descripción: "+ miProducto.getDesc() +" Cantidad: "+ miProducto.getCant() +
					 " Peso: " + miProducto.getPeso()+ "\n";	 
					 }return productos;
				 }
	 
		
	 public String buscarProducto(String localizador, String codProd) {
		 String productos=null;
		 for(Producto miProducto: misProductos) {
			 if(miProducto.getCodProd().equals(codProd)) {
				 productos="Producto " + miProducto.getCodProd()+ ": " 
						 + miProducto.getDesc() + miProducto.getCant() +
						 miProducto.getPeso();
							 return productos;
						 }
					 
					 
		 }return productos;
				 
		 
	 }
	 

	 
	 
	 public String getLocalizador() {
			return localizador;
		}

		public void setLocalizador(String localizador) {
			this.localizador = localizador;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getDniC() {
			return dniC;
		}

		public void setDniC(String dniC) {
			this.dniC = dniC;
		}

		public String getFechaEnvio() {
			return fechaEnvio;
		}

		public void setFechaEnvio(String fechaEnvio) {
			this.fechaEnvio = fechaEnvio;
		}

		public int getDias() {
			return dias;
		}

		public void setDias(int dias) {
			this.dias = dias;
		}
		
		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
}
