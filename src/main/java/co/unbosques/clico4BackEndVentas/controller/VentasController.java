package co.unbosques.clico4BackEndVentas.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.unbosques.clico4BackEndVentas.model.Ventas;
import co.unbosques.clico4BackEndVentas.service.interfaces.IVentasService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ventas")
@Api(tags = "Ventas", description = "EnPoints Para la Gesti�n de Ventas")
@CrossOrigin(origins = "*")
public class VentasController {

	@Autowired
	private IVentasService iventasService;

	@PostMapping
	public Ventas crearVenta(@Validated  @RequestBody Ventas venta) throws Exception {
	
		venta.setCodigo_venta(cadenaAleatoria(10));
		return  iventasService.saveVenta(venta);
	}

	public static String cadenaAleatoria(int longitud) {
	    // El banco de caracteres
	    String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    // La cadena en donde iremos agregando un carácter aleatorio
	    String cadena = "";
	    for (int x = 0; x < longitud; x++) {
	        int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
	        char caracterAleatorio = banco.charAt(indiceAleatorio);
	        cadena += caracterAleatorio;
	    }
	    return cadena;
	}
	
	public static int numeroAleatorioEnRango(int minimo, int maximo) {
	    // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
	    return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
	}
	@GetMapping()
	public List<Ventas> listarVentas() {
		List<Ventas> listaVentas = new ArrayList<Ventas>();

		try {

			listaVentas = iventasService.ListarVentas();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return listaVentas;

	}

	@DeleteMapping(path = "/{id}")
	public void eliminarVenta(@PathVariable("id") long id) {
		try {
			iventasService.deleteVentaById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PutMapping()
	public void actualizarVenta(@RequestBody Ventas venta) {
		try {
			iventasService.updateVenta(venta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
