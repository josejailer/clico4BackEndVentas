package co.unbosques.clico4BackEndVentas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unbosques.clico4BackEndVentas.model.Ventas;
import co.unbosques.clico4BackEndVentas.modelDao.interfaces.IVentasDao;
import co.unbosques.clico4BackEndVentas.service.interfaces.IVentasService;

@Service
public class VentaService implements IVentasService {

	@Autowired
	private IVentasDao ventasDao;
	
	@Override
	public Ventas saveVenta(Ventas venta)  {
		return ventasDao.insert(venta);
		
	}

	@Override
	public List<Ventas> ListarVentas() {
		return ventasDao.findAll();
	}

	@Override
	public void deleteVentaById(long codigo_venta)  {
		ventasDao.deleteById(codigo_venta);
		
	}

	@Override
	public void findVentaById(long codigo_venta) {
		ventasDao.findById(codigo_venta);
		
	}

	@Override
	public void updateVenta(Ventas venta) {
		ventasDao.save(venta);		
	}

}
