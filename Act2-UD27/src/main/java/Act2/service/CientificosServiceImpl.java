package Act2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Act2.dao.ICientificosDAO;
import Act2.dto.Cientificos;
@Service
public class CientificosServiceImpl {

	
	@Autowired
	ICientificosDAO iCientificosService;
	
	
	public void borrarCientifico(String id) {
		// TODO Auto-generated method stub
		iCientificosService.deleteById(id);

	}

	public Cientificos actualizarCientifico(Cientificos cientifico_seleccionado) {
		// TODO Auto-generated method stub
		return iCientificosService.save(cientifico_seleccionado);
	}

	public Cientificos cientificoXID(String id) {
		// TODO Auto-generated method stub
		return iCientificosService.findById(id).get();
	}

	public Cientificos guardarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificosService.save(cientifico);
	}

	public List<Cientificos> listarCientificos() {
		// TODO Auto-generated method stub
		return iCientificosService.findAll();
	}

}
