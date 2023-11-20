package Act3.service;

import java.util.List;

import Act3.dto.Producto;

public interface IProductoService {

	public List<Producto> listarProducto(); // Listar All

	public Producto guardarProducto(Producto producto); // Guarda un departamento CREATE

	public Producto actualizarProducto(Producto producto); // Actualiza datos del departamento UPDATE

	Producto productoXID(Long id);

	void borrarProducto(Long id);
}
