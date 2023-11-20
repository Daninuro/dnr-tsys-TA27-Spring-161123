package Act3.service;

import java.util.List;

import Act3.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	// Metodos del CRUD
	public List<MaquinaRegistradora> listarMaquina(); // Listar All

	public MaquinaRegistradora guardarMaquina(MaquinaRegistradora maquina); // Guarda un proveedor CREATE

	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquina); // Actualiza datos del proveedor UPDATE

	MaquinaRegistradora maquinaXID(Long id);

	void borrarMaquina(Long id);
}
