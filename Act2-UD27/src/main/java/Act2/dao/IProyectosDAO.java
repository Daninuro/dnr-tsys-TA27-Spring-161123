package Act2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act2.dto.Proyectos;

public interface IProyectosDAO extends JpaRepository<Proyectos, String> {

}
