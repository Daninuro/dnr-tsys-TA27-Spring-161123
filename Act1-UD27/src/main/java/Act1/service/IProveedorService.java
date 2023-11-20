package Act1.service;

import java.util.List;

import Act1.dto.Proveedor;

public interface IProveedorService {

	List<Proveedor> listarProv();
	
	Proveedor proveedorPorCodigo(String id);
	
	Proveedor guardarProveedor(Proveedor prov);
	
	Proveedor updateProveedor(Proveedor prov);
	
	void borrarProveedor(String id);
}
