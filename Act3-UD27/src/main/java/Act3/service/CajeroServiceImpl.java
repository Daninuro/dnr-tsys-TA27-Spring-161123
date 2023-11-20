package Act3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act3.dao.ICajeroDAO;
import Act3.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService{

	
	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listarCajero() {
		// TODO Auto-generated method stub
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(Long id) {
		// TODO Auto-generated method stub
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void borrarCajero(Long id) {
		// TODO Auto-generated method stub
		iCajeroDAO.deleteById(id);
	}

}
