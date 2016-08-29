package br.gov.mec.aghu.model;

// Generated 26/02/2010 15:51:00 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelProjetoPacientesId generated by hbm2java
 */
@Embeddable
public class AelProjetoPacientesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6326806654964537323L;
	private Integer pjqSeq;
	private Integer pacCodigo;

	public AelProjetoPacientesId() {
	}

	public AelProjetoPacientesId(Integer pjqSeq, Integer pacCodigo) {
		this.pjqSeq = pjqSeq;
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "PJQ_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getPjqSeq() {
		return this.pjqSeq;
	}

	public void setPjqSeq(Integer pjqSeq) {
		this.pjqSeq = pjqSeq;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelProjetoPacientesId)) {
			return false;
		}
		AelProjetoPacientesId castOther = (AelProjetoPacientesId) other;

		return (this.getPjqSeq().intValue() == castOther.getPjqSeq().intValue())
				&& (this.getPacCodigo().intValue() == castOther.getPacCodigo().intValue());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPjqSeq();
		result = 37 * result + this.getPacCodigo();
		return result;
	}

}