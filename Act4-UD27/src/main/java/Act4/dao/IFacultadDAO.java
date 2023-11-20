package Act4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act4.dto.Facultad;

public interface IFacultadDAO  extends  JpaRepository<Facultad, Long> {

}
