package Act3.service;

import java.util.List;

import Act3.dto.Cajero;

public interface ICajeroService {

	// Metodos del CRUD
	public List<Cajero> listarCajero(); // Listar All

	public Cajero guardarCajero(Cajero cajero); // Guarda un departamento CREATE

	public Cajero actualizarCajero(Cajero cajero); // Actualiza datos del departamento UPDATE

	void borrarCajero(Long id);

	Cajero cajeroXID(Long id);

}
