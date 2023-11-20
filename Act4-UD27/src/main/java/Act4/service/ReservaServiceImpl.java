package Act4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Act4.dao.IReservaDAO;
import Act4.dto.Reserva;
@Service
public class ReservaServiceImpl implements IReservaService {
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReserva() {
		// TODO Auto-generated method stub
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva reservaXID(Long id) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public void borrarReserva(Long id) {
		iReservaDAO.deleteById(id);
	}

}
