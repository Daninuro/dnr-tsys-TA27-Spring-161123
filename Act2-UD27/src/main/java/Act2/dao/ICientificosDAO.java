package Act2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act2.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, String> {

}
