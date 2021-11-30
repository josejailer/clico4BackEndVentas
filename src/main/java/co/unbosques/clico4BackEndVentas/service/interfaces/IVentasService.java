package co.unbosques.clico4BackEndVentas.service.interfaces;

import java.util.List;

import co.unbosques.clico4BackEndVentas.model.Ventas;

public interface IVentasService {
	
	public Ventas saveVenta(Ventas venta) throws Exception;
	
	public List<Ventas> ListarVentas() throws Exception;
	
	public void deleteVentaById(long codigo_venta) throws Exception;
	
	public void findVentaById(long codigo_venta) throws Exception;
	
	public void updateVenta(Ventas venta) throws Exception;

}
