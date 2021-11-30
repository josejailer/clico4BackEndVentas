package co.unbosques.clico4BackEndVentas.modelDao.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.unbosques.clico4BackEndVentas.model.Ventas;

public interface IVentasDao extends MongoRepository<Ventas, Long> {
	

}
