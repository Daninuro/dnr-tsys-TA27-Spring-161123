package Act1.service;

import java.util.List;

import Act1.dto.Pieza;

public interface IPiezaService {
	
	
	List<Pieza> listarPiezas();
	
	Pieza guardarPieza(Pieza pieza);
	
	Pieza piezaPorCodigo(int codigo);
	
	Pieza updatePieza(Pieza pieza);
	
	void borrarPieza(int codigo);

}