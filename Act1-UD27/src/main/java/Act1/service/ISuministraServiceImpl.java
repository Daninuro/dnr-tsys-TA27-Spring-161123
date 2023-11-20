package Act1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import Act1.dao.SuministraDAO;
import Act1.dto.Suministra;

@Service
public class ISuministraServiceImpl implements ISuministraService{

	@Autowired
	SuministraDAO iSuministraService;
	
	@Override
	public List<Suministra> listarSuministra() {
		// TODO Auto-generated method stub
		return iSuministraService.findAll();
	}

	@Override
	public Suministra suministraPorId(int id) {
		// TODO Auto-generated method stub
		return iSuministraService.findById(id).get();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraService.save(suministra);
	}

	@Override
	public Suministra updateSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraService.save(suministra);
	}

	@Override
	public void borrarSuministra(int id) {
		// TODO Auto-generated method stub
		iSuministraService.deleteById(id);
	}

}
