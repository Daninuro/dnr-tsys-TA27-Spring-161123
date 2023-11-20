package Act3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act3.dao.IMaquinaRegistradoraDAO;
import Act3.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService {

	
	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;
	@Override
	public List<MaquinaRegistradora> listarMaquina() {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinaRegistradora guardarMaquina(MaquinaRegistradora maquina) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.save(maquina);
	}

	@Override
	public MaquinaRegistradora maquinaXID(Long id) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.findById(id).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquina) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.save(maquina);
	}

	@Override
	public void borrarMaquina(Long id) {
		// TODO Auto-generated method stub
		iMaquinaRegistradoraDAO.deleteById(id);
	}

}
