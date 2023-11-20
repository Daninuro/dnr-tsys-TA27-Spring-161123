package Act4.service;

import java.util.List;

import Act4.dto.Facultad;

public interface IFacultadService {
	public List<Facultad> listarFacultad();

	public Facultad guardarFacultad(Facultad facultad);

	public Facultad facultadXID(Long id);

	public Facultad actualizarFacultad(Facultad facultad);

	public void borrarFacultad(Long id);
}
