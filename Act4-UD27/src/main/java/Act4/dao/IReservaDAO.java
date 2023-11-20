package Act4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Act4.dto.Reserva;

public interface IReservaDAO  extends  JpaRepository<Reserva, Long> {

}
