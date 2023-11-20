package Act1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import Act1.dao.ProveedorDAO;
import Act1.dto.Proveedor;

@Service
public class IProveedorServiceImpl implements IProveedorService{

	@Autowired
	ProveedorDAO iProveedorService;
	
	@Override
	public List<Proveedor> listarProv() {
		// TODO Auto-generated method stub
		return iProveedorService.findAll();
	}

	@Override
	public Proveedor proveedorPorCodigo(String id) {
		// TODO Auto-generated method stub
		return iProveedorService.findById(id).get();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor prov) {
		// TODO Auto-generated method stub
		return iProveedorService.save(prov);
	}

	@Override
	public Proveedor updateProveedor(Proveedor prov) {
		// TODO Auto-generated method stub
		return iProveedorService.save(prov);
	}

	@Override
	public void borrarProveedor(String id) {
		// TODO Auto-generated method stub
		iProveedorService.deleteById(id);
	}

	
}
