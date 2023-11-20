package Act1.service;

import java.util.List;

import Act1.dto.Suministra;

public interface ISuministraService {

	List<Suministra> listarSuministra();
	
	Suministra suministraPorId(int id);
	
	Suministra guardarSuministra(Suministra suministra);
	
	Suministra updateSuministra(Suministra suministra);
	
	void borrarSuministra(int id);
}
