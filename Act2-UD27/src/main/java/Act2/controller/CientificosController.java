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

import Act2.dto.Cientificos;
import Act2.service.CientificosServiceImpl;

@RestController
@RequestMapping("/cientificos")
public class CientificosController {

	

	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	

	@GetMapping("/cientificos")
	public List<Cientificos> listarCientifico() {
		return cientificosServiceImpl.listarCientificos();
	}
	

	@PostMapping("/cientificos")
	public Cientificos saveCientifico(@RequestBody Cientificos cientifico) {
		return cientificosServiceImpl.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientificos cientificoXID(@PathVariable(name = "id") String id) {
		Cientificos cientificos = new Cientificos();
		cientificos = cientificosServiceImpl.cientificoXID(id);
		return cientificos;
	}
	

	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientifico(@PathVariable(name = "id") String id, @RequestBody Cientificos cientifico) {

		Cientificos proyecto_seleccionado = new Cientificos();
		Cientificos cientifico_actualizado = new Cientificos();
		proyecto_seleccionado = cientificosServiceImpl.cientificoXID(id);
		proyecto_seleccionado.setDni(cientifico.getDni());
		proyecto_seleccionado.setNombreApellidos(cientifico.getNombreApellidos());
		


		cientifico_actualizado = cientificosServiceImpl.actualizarCientifico(proyecto_seleccionado);

		return cientifico_actualizado;
	}
	@DeleteMapping("/cientificos/{id}")
	public void borrarCientifico(@PathVariable(name = "id") String id) {
		cientificosServiceImpl.borrarCientifico(id);
	}
}
