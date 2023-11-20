package Act2.service;

import java.util.List;

import Act2.dto.Asignadoa;

public interface IAsignadoaService {

	public List<Asignadoa> listarAsignado();

	public Asignadoa guardarAsignado(Asignadoa asignado);

	public Asignadoa actualizarAsignado(Asignadoa asignado);

	void borrarAsignado(Long id);

	Asignadoa asignadoaXID(Long id);
}
