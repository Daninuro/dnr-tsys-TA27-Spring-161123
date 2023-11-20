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

import Act1.dto.Pieza;
import Act1.service.IPiezaService;
import Act1.service.IPiezaServiceImpl;

@RestController
@RequestMapping("/piezas")
public class PiezaController {

	@Autowired
	private IPiezaService piezaService;
	
    @PostMapping("/añadir")
    public Pieza insertarProveedor(@RequestBody Pieza pieza) {
    	
    	return piezaService.guardarPieza(pieza);
    }
    
    @GetMapping("/todos")
    public List <Pieza> getAllPiezas(){
    	
    	return piezaService.listarPiezas();
    }
    
    @GetMapping("/{codigo}")
    public Pieza piezaPorCod(@PathVariable int codigo) {
    	
    	return piezaService.piezaPorCodigo(codigo);
    }
    
    @PutMapping("/{codigo}")
    public Pieza updatePieza(@PathVariable(name = "codigo") int codigo, @RequestBody Pieza pieza) {
    	
        Pieza piezaSeleccionado = piezaService.piezaPorCodigo(codigo);
        	
            piezaSeleccionado.setNombre(pieza.getNombre());
            Pieza piezaActualizado = piezaService.updatePieza(piezaSeleccionado);
            
            return piezaActualizado;
 
    }
    
    @DeleteMapping("/{codigo}")
    public void borrarPieza(@PathVariable(name = "codigo")int codigo) {
    	
    	piezaService.borrarPieza(codigo);
    }
}
