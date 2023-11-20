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

import Act2.dto.Asignadoa;
import Act2.service.AsignadoaServiceImpl;

@RestController
@RequestMapping("/asignados")
public class AsignadoaController {
	@Autowired
	AsignadoaServiceImpl asingadoaServiceImpl;;

	@GetMapping("/asignados")
	public List<Asignadoa> listarAsignadoa() {
		return asingadoaServiceImpl.listarAsignado();
	}

	@PostMapping("/asignados")
	public Asignadoa guardarAsignadoa(@RequestBody Asignadoa asignado) {
		return asingadoaServiceImpl.guardarAsignado(asignado);
	}

	@GetMapping("/asignados/{id}")
	public Asignadoa asignadoaXID(@PathVariable(name = "id") Long id) {
		Asignadoa asignadoa = new Asignadoa();
		asignadoa = asingadoaServiceImpl.asignadoaXID(id);
		return asignadoa;
	}

	@PutMapping("/asignados/{id}")
	public Asignadoa actualizarAsignadoa(@PathVariable(name = "id") Long id, @RequestBody Asignadoa asignado) {

		Asignadoa asignado_seleccionado = new Asignadoa();
		Asignadoa asignado_actualizado = new Asignadoa();
		asignado_seleccionado = asingadoaServiceImpl.asignadoaXID(id);
		asignado_seleccionado.setId(id);
		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());

		asignado_actualizado = asingadoaServiceImpl.actualizarAsignado(asignado_seleccionado);
		return asignado_actualizado;
	}

	@DeleteMapping("/asignados/{id}")
	public void eliminarAsignadoa(@PathVariable(name = "id") Long id) {
		asingadoaServiceImpl.borrarAsignado(id);
	}
}
