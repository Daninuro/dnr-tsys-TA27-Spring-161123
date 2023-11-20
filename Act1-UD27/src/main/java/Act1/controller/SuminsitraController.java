package Act1.controller;

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

import Act1.dto.Suministra;
import Act1.service.ISuministraService;
import Act1.service.ISuministraServiceImpl;

@RestController
@RequestMapping("/suministra")
public class SuminsitraController {

	@Autowired
	private ISuministraService iService;
	
	@GetMapping("/todos")
	public List<Suministra> todoSuministra(){
		
		return iService.listarSuministra();
	}
	
	@GetMapping("/{id}")
	public Suministra sumPorId(@PathVariable int id) {
		
		return iService.suministraPorId(id);
	}
	
	@PostMapping("/add")
	public Suministra guardaSum(@RequestBody Suministra suministra) {
		
		return iService.guardarSuministra(suministra);
	}
	
	@PutMapping("/{id}")
	public Suministra updateSum(@PathVariable int id, @RequestBody Suministra suministra) {
		
		return iService.updateSuministra(suministra);
	}
	
	@DeleteMapping("/{id}")
	public void borrarSum(@PathVariable int id) {
		
		iService.borrarSuministra(id);
	}
}
