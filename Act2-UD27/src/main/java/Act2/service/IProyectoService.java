package Act2.service;

import java.util.List;

import Act2.dto.Proyectos;

public interface IProyectoService {
	public List<Proyectos> listarProyecto();

	public Proyectos guardarProyecto(Proyectos proyecto);

	public Proyectos proveedorById(int id);

	public Proyectos actualizarProyecto(Proyectos proyecto);

	public void borrarProyecto(int id);
}
