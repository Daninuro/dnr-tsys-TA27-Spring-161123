package Act2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Act2.dto.Proyectos;
import Act2.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;


	@GetMapping("/proyectos")
	public List<Proyectos> listarProyecto() {
		return proyectoServiceImpl.listarProyecto();
	}

	@PostMapping("/proyectos")
	public Proyectos guardarProyecto(@RequestBody Proyectos proyecto) {
		return proyectoServiceImpl.guardarProyectos(proyecto);
	}

	@GetMapping("/proyectos/{id}")
	public Proyectos proyectosXID(@PathVariable(name = "id") String id) {
		Proyectos proyectos = new Proyectos();
		proyectos = proyectoServiceImpl.proyectosXID(id);
		return proyectos;
	}

	@PutMapping("/proyectos/{id}")
	public Proyectos actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyectos proyecto) {

		Proyectos proyecto_seleccionado = new Proyectos();
		Proyectos proyecto_actualizado = new Proyectos();

		proyecto_seleccionado = proyectoServiceImpl.proyectosXID(id);

		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());

		proyecto_actualizado = proyectoServiceImpl.actualizarProyectos(proyecto_seleccionado);
		return proyecto_actualizado;
	}

	@DeleteMapping("/proyectos/{id}")
	public void borrarProyecto(@PathVariable(name = "id") String id) {
		proyectoServiceImpl.borrarProyectos(id);
	}
}
