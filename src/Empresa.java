import java.util.ArrayList;


public class Empresa {
	
	private ArrayList < Paquete > misPaquetes ;
	
	
	protected String codProd;
	protected String desc;
	protected int cant;
	protected float peso;
	protected String estado;
	
	
	 public Empresa() {
		
		this.misPaquetes = misPaquetes;
		this.codProd = codProd;
		this.desc = desc;
		this.cant = cant;
		this.peso = peso;
		this.estado = estado;
		misPaquetes = new ArrayList<>();
	}


	public boolean borrarPaquete(String localizador) {
	    	for (int i = 0; i < misPaquetes.size(); i++) {
	    		 if (misPaquetes.get(i) != null && misPaquetes.get(i).getEstado().compareTo("Vacío")==0 ) {
	    			 if(misPaquetes.get(i).getLocalizador().compareTo(localizador)==0) {
		    			 misPaquetes.remove(i);  
		                 return true;
	    			 }
	    		 }
	    	}return false;
	    }
	
	
	public boolean borrarProductoo(String localizador,String codProd) {
    	for (int i = 0; i < misPaquetes.size(); i++) {
    		 if (misPaquetes.get(i) != null && misPaquetes.get(i).getEstado().compareTo("Vacío")==0 ) {
    			 if(misPaquetes.get(i).getLocalizador().compareTo(localizador)==0) {
    				return misPaquetes.get(i).borrarProducto(localizador, codProd); 
    			 }
    		 }
    	}return false;
    }

	/*
	 public boolean borrarProducto(String codProd, String localizador) {
		 for (int i = 0; i < misPaquetes.size(); i++) {
			 if(misPaquetes.get(i).getLocalizador().equals(localizador)) {
				return misPaquetes.get(i).borrarProducto(codProd, localizador);
				 
			 }
		}return false;
	}*/

	 public String mostrarPaquetes() {	
		 String paquetes="";
		 for (int i = 0; i < misPaquetes.size(); i++) {
	 		if (misPaquetes != null) {
	 			paquetes += "Paquete " + misPaquetes.get(i).getLocalizador() + ": " + misPaquetes.get(i).getEstado() + "\n" ;
	 		 }
 		}return paquetes;
 	}
	 

	 public boolean addProducto(String codProd, String desc, int cant, float peso, String localizador){
		 for (int i = 0; i < misPaquetes.size(); i++) {
			 if(misPaquetes.get(i).getLocalizador().compareTo(localizador)==0){
	    		if (misPaquetes.get(i).getEstado().compareTo("Vacío")==0 || misPaquetes.get(i).getEstado().compareTo("Preparación")==0 ) {
	    			misPaquetes.get(i).addProducto(codProd, desc, cant, peso);
	    			return true;	
	    		}
	    	}
		}
	    	return false;
	  }
	 


	 public String mostrardeotraforma(String estado) {	
		String paquetes = "";
		 for(Paquete miPaquete: misPaquetes) {
			 if(miPaquete.getEstado().equals(estado)){
				 paquetes+="Paquete " + miPaquete.getLocalizador()+ ": " 
			 + "Direción: " + miPaquete.getDireccion() + " Fecha envio: " + miPaquete.getFechaEnvio() + " Días: " +
			 miPaquete.getDias() + " Dni Cliente: " + miPaquete.getDniC()+ "\n";
			 }
		 }
		 return paquetes;
	 }

	 	
	 public String listarProductoss(String localizador) {	
		 for(Paquete miPaquete: misPaquetes) {
			 if(miPaquete.getLocalizador().compareTo(localizador)==0){
				return miPaquete.listarProductos();
			 }
		}return null;
	 }

	 
	 public Paquete crearPaquete(String localizador, String direccion, String dniC, String fechaEnvio, int dias, String estado) {
	        Paquete miPaquete = new Paquete(localizador, direccion, dniC, fechaEnvio, dias, estado);
	        misPaquetes.add(miPaquete);
	        return miPaquete;
	        
	    }
	
	 public boolean buscarProducto(String localizador, String codProd) {
		 for(Paquete miPaquete: misPaquetes) {
			 if(miPaquete.getLocalizador().equals(localizador)) {
				 miPaquete.buscarProducto(localizador, codProd);
				 return true;
				 }
			 }return false;
		 
	 }
}
	 

