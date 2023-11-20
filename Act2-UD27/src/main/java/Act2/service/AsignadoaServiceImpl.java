package Act2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act2.dao.IAsignadoaDAO;
import Act2.dto.Asignadoa;
@Service
public class AsignadoaServiceImpl implements IAsignadoaService {
	@Autowired
	IAsignadoaDAO iAsignadoService;

	@Override
	public List<Asignadoa> listarAsignado() {
		return iAsignadoService.findAll();
	}

	@Override
	public Asignadoa guardarAsignado(Asignadoa asignado) {
		return iAsignadoService.save(asignado);
	}

	@Override
	public Asignadoa asignadoaXID(Long id) {
		return iAsignadoService.findById(id).get();
	}

	@Override
	public Asignadoa actualizarAsignado(Asignadoa asignado) {
		return iAsignadoService.save(asignado);
	}

	@Override
	public void borrarAsignado(Long id) {
		iAsignadoService.deleteById(id);

	}

	

	
}
