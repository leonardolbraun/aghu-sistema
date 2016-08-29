package br.gov.mec.aghu.model;

// Generated 10/03/2011 17:20:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelOrdExameMatAnalisesId generated by hbm2java
 */
@Embeddable
public class AelOrdExameMatAnaliseId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6711309133485217873L;
	private String emaExaSigla;
	private Integer emaManSeq;

	public AelOrdExameMatAnaliseId() {
	}

	public AelOrdExameMatAnaliseId(String emaExaSigla, Integer emaManSeq) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelOrdExameMatAnaliseId)) {
			return false;
		}
		AelOrdExameMatAnaliseId castOther = (AelOrdExameMatAnaliseId) other;

		return ((this.getEmaExaSigla().equals(castOther.getEmaExaSigla())) || (this
				.getEmaExaSigla() != null && castOther.getEmaExaSigla() != null && this
				.getEmaExaSigla().equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq().equals(castOther.getEmaManSeq()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		return result;
	}

}