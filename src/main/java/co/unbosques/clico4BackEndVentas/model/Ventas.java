package co.unbosques.clico4BackEndVentas.model;

import java.util.ArrayList;
 
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;

@Document(collection = "db_ventas")
@ApiModel("Modelo Ventas")
public class Ventas {

	@Id
	private String codigo_venta;
	private long cedula_cliente;
	private ArrayList<Detalle_Ventas> detalle_Venta;
	private double iva_venta;
	private double total_venta;
	private double valor_venta;
	private String ciudad;
	private long  cedula_usuario;

	public long getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getCodigo_venta() {
		return codigo_venta;
	}

	public void setCodigo_venta(String codigo_venta) {
		this.codigo_venta = codigo_venta;
	}

	public ArrayList<Detalle_Ventas> getDetalle_Venta() {
		return detalle_Venta;
	}

	public void setDetalle_Venta(ArrayList<Detalle_Ventas> detalle_Venta) {
		this.detalle_Venta = detalle_Venta;
	}

	public double getIva_venta() {
		return iva_venta;
	}

	public void setIva_venta(double iva_venta) {
		this.iva_venta = iva_venta;
	}

	public double getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}

	public double getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public long getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

 
	
	

}
