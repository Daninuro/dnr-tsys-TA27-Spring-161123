package Act3.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajeros")
public class Cajero {
	// Atributos de entidad departamento
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nomApels")
	private String nomApels;

	 @JsonIgnore
	 @OneToMany(mappedBy = "cajero", cascade = CascadeType.ALL, orphanRemoval = true)
	 private List<Ventas> venta;

	// CONSTRUCTORES
	public Cajero() {

	}

	public Cajero(String nomApels) {
		this.nomApels = nomApels;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public List<Ventas> getVenta() {
		return venta;
	}

	public void setVenta(List<Ventas> venta) {
		this.venta = venta;
	}
	
	

}
