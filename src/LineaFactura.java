
/**
 * Clase que aloja las líneas de cada factura. 
 * @author Mireia Ballester
 * @see Factura
 */
public class LineaFactura {
		
	public String id_producto; 		
	public String nombre_producto; 
	
	public float precio; 			
	public float cantidad; 		
	public float descuento; 		
	
	/**
	 * Constructor LineaFactura
	 * @param idProducto String identificador código del producto
	 * @param nombre_Producto String que identifica el nombre del producto
	 * @param precio precio por una unidad del producto
	 * @param cantidad cantidad de unidades compradas
	 * @param descuento descuento sobre la unidad (no se está utilizando) 
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	/**
	 * Método getTotal de la clase LineaFactura
	 * @return Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos pedidos de esa uniad 
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
