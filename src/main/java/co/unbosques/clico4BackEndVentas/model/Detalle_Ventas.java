package co.unbosques.clico4BackEndVentas.model;


public class Detalle_Ventas {
	
	private double codigo_detalleventa;
	private int cantidad_producto;
	private long codigo_producto; 
	private double valor_total;
	private double valor_venta;
	private double valoriva;
	
	public double getCodigo_detalleventa() {
		return codigo_detalleventa;
	}

	public void setCodigo_detalleventa(double codigo_detalleventa) {
		this.codigo_detalleventa = codigo_detalleventa;
	}

	public int getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public long getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public double getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}

	public double getValoriva() {
		return valoriva;
	}

	public void setValoriva(double valoriva) {
		this.valoriva = valoriva;
	}
	
	
	
	
	
		
	
}
