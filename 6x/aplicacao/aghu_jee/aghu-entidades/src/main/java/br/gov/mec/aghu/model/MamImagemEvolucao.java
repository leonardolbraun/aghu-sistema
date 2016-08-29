package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamImagemEvolucao generated by hbm2java
 */
@Entity
@Table(name = "MAM_IMAGEM_EVOLUCOES", schema = "AGH")
public class MamImagemEvolucao extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5261630154727054133L;
	private Long fieSeq;
	private Integer version;
	private MamFiguraEvolucao mamFiguraEvolucao;
	private byte[] imagem;

	public MamImagemEvolucao() {
	}

	public MamImagemEvolucao(MamFiguraEvolucao mamFiguraEvolucao, byte[] imagem) {
		this.mamFiguraEvolucao = mamFiguraEvolucao;
		this.imagem = imagem;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "mamFiguraEvolucao"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "FIE_SEQ", unique = true, nullable = false)
	public Long getFieSeq() {
		return this.fieSeq;
	}

	public void setFieSeq(Long fieSeq) {
		this.fieSeq = fieSeq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public MamFiguraEvolucao getMamFiguraEvolucao() {
		return this.mamFiguraEvolucao;
	}

	public void setMamFiguraEvolucao(MamFiguraEvolucao mamFiguraEvolucao) {
		this.mamFiguraEvolucao = mamFiguraEvolucao;
	}

	@Column(name = "IMAGEM", nullable = false)
	public byte[] getImagem() {
		return this.imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public enum Fields {

		FIE_SEQ("fieSeq"),
		VERSION("version"),
		MAM_FIGURA_EVOLUCOES("mamFiguraEvolucao"),
		IMAGEM("imagem");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getFieSeq() == null) ? 0 : getFieSeq().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MamImagemEvolucao)) {
			return false;
		}
		MamImagemEvolucao other = (MamImagemEvolucao) obj;
		if (getFieSeq() == null) {
			if (other.getFieSeq() != null) {
				return false;
			}
		} else if (!getFieSeq().equals(other.getFieSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
 
 @Transient public Long getSeq(){ return this.getFieSeq();} 
 public void setSeq(Long seq){ this.setFieSeq(seq);}
}