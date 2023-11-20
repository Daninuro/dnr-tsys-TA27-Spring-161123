package Act3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act3.dao.IVentasDAO;
import Act3.dto.Ventas;

@Service
public class VentasServiceImpl implements IVentasService{

	@Autowired
	IVentasDAO iVentaDAO;
	
	@Override
	public List<Ventas> listarVenta() {
		// TODO Auto-generated method stub
		return iVentaDAO.findAll();
	}

	@Override
	public Ventas guardarVenta(Ventas venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public Ventas ventaXID(int id) {
		// TODO Auto-generated method stub
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Ventas actualizarVenta(Ventas venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public void borrarVenta(int id) {
		// TODO Auto-generated method stub
		iVentaDAO.deleteById(id);
	}

}
