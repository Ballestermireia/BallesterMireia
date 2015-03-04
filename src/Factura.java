
import java.util.Arrays;
/**
 * Clase que registra las facturas
 * @author Mireia Ballester
 */
public class Factura {
	
	public String id_cliente;	
	public String nombre_cliente;	
	
	public LineaFactura lineas[];
		
	/**
	 * Constructor Factura
	 * @param id_cliente String identificador c�digo del cliente
	 * @param nombreCliente String para el nombre del cliente
	 * @param LineaFactura es un array que almacena la lista de productos comprados
	 * @see LineaFactura
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}
	/**
	 * Método getTotal() 
	 * @return Devuelve el precio total de la Factura, calculado a partir del precio de cada linea	
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}

	/**
	 * Método main de la clase Factura, crea una factura y la muestra por pantalla
	 */
	public static void main(String[] args){
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		System.out.println( factura1 );
		
	}	
	
}
