package Act3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act3.dto.Producto;


public interface IProductoDAO extends JpaRepository<Producto, Long> {

}
