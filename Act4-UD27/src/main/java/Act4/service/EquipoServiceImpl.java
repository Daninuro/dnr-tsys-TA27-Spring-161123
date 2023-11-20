package Act4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act4.dao.IEquipoDAO;
import Act4.dto.Equipos;
@Service
public class EquipoServiceImpl implements IEquipoService{
@Autowired
	IEquipoDAO iEquipoDAO;
	@Override
	public List<Equipos> listarEquipo() {
		// TODO Auto-generated method stub
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipos guardarEquipo(Equipos equipo) {
		// TODO Auto-generated method stub
		return iEquipoDAO.save(equipo);
	}

	
	@Override
	public Equipos actualizarEquipo(Equipos equipo) {
		// TODO Auto-generated method stub
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void borrarEquipo(Long id) {
		// TODO Auto-generated method stub
		iEquipoDAO.deleteById(id);
	}

	public Equipos equiposXID(Long id) {
		// TODO Auto-generated method stub
		return iEquipoDAO.findById(id).get();
	}

}
