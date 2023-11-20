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
import Act1.dto.Proveedor;
import Act1.service.IProveedorService;
import Act1.service.IProveedorServiceImpl;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

	@Autowired
	private IProveedorService IProveedorService;
	
    @PostMapping("/añadir")
    public Proveedor insertarProveedor(@RequestBody Proveedor proveedor) {
    	
    	return IProveedorService.guardarProveedor(proveedor);
    }
    
    @GetMapping("/todos")
    public List <Proveedor> listarPiezas() {
    	
    	return IProveedorService.listarProv();
    }
    
    @GetMapping("/{id}")
    public Proveedor proveedorPorId(@PathVariable(name = "id") String id) {
    	
    	Proveedor provPorId = IProveedorService.proveedorPorCodigo(id);
    	System.out.println("Proveedor por ID" + provPorId);
    	
    	return provPorId;
    }
    
    @PutMapping("{id}")
	public Proveedor updateProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor proveedor) {
    	
    	Proveedor provSeleccionado = IProveedorService.proveedorPorCodigo(id);
	
    		provSeleccionado.setNombre(proveedor.getNombre());
    		Proveedor provUpdate = IProveedorService.updateProveedor(provSeleccionado);
    		
    		return provUpdate;
    		
    }
    
    @DeleteMapping("/{id}")
    public void borrarProveedor(@PathVariable(name = "id")String id) {
    	
    	IProveedorService.borrarProveedor(id);
    }
}
