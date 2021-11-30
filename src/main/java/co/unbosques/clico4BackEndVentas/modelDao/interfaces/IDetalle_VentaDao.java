package co.unbosques.clico4BackEndVentas.modelDao.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.unbosques.clico4BackEndVentas.model.Detalle_Ventas;

public interface IDetalle_VentaDao extends MongoRepository<Detalle_Ventas, Long>
{

}
