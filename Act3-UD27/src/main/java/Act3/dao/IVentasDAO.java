package Act3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act3.dto.Ventas;


public interface IVentasDAO extends JpaRepository<Ventas, Integer> {

}
