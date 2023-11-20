package Act3.service;

import java.util.List;

import Act3.dto.Ventas;

public interface IVentasService {

	// Metodos del CRUD
	public List<Ventas> listarVenta(); // Listar All

	public Ventas guardarVenta(Ventas venta); // Guarda un suministra CREATE

	public Ventas actualizarVenta(Ventas venta); // Actualiza datos del suministra UPDATE

	public void borrarVenta(int id);// Elimina el suministra DELETE

	Ventas ventaXID(int id);

}
