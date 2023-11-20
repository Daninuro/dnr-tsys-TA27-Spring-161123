package Act4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act4.dto.Equipos;


public interface IEquipoDAO extends  JpaRepository<Equipos, Long> {

}
