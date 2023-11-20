package Act2.service;

import java.util.List;

import Act2.dto.Cientificos;

public interface ICientificoService {
	// Metodos del CRUD
		public List<Cientificos> listarCientifico();

		public Cientificos guardarCientifico(Cientificos cientifico);

		public Cientificos cientificoById(int id);

		public Cientificos actualizarCientifico(Cientificos cientifico);

		public void borrarCientifico(int id);
}
