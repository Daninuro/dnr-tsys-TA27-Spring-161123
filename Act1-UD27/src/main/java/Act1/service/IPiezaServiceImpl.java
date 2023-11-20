package Act1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import Act1.dao.PiezaDAO;
import Act1.dto.Pieza;

@Service
public class IPiezaServiceImpl implements IPiezaService{

	@Autowired
	private PiezaDAO piezaService;
	
	@Override
	public List<Pieza> listarPiezas() {
		// TODO Auto-generated method stub
		return piezaService.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return piezaService.save(pieza);
	}

	@Override
	public Pieza piezaPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return piezaService.findById(codigo).get();
	}

	@Override
	public Pieza updatePieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return piezaService.save(pieza);
	}

	@Override
	public void borrarPieza(int codigo) {
		// TODO Auto-generated method stub
		piezaService.deleteById(codigo);
	}

}
