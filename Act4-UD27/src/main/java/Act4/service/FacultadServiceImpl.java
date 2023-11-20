package Act4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Act4.dao.IFacultadDAO;
import Act4.dto.Facultad;
@Service
public class FacultadServiceImpl implements IFacultadService{

	IFacultadDAO iFacultadDAO;
	
	
	@Override
	public List<Facultad> listarFacultad() {
		// TODO Auto-generated method stub
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadXID(Long id) {
		// TODO Auto-generated method stub
		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void borrarFacultad(Long id) {
		// TODO Auto-generated method stub
		iFacultadDAO.deleteById(id);
	}

}
