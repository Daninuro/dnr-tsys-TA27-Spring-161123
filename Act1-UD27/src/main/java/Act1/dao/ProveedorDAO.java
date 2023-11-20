package Act1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act1.dto.Proveedor;

public interface ProveedorDAO extends JpaRepository<Proveedor, String>{
	
}
