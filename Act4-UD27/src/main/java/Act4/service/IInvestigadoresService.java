package Act4.service;

import java.util.List;

import Act4.dto.Investigador;

public interface IInvestigadoresService {
	
	
	public List<Investigador> listarInvestigador();

	public Investigador guardarInvestigador(Investigador investigador);

	public Investigador investigadorXID(Long id);

	public Investigador actualizarInvestigador(Investigador investigador);

	public void borrarInvestigador(Long id);
}
