package br.gov.mec.aghu.model;

// Generated 18/03/2011 10:47:15 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExamesNotificacaoId generated by hbm2java
 */
@Embeddable
public class AelExamesNotificacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5019451160114865617L;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Integer calSeq;

	public AelExamesNotificacaoId() {
	}

	public AelExamesNotificacaoId(String emaExaSigla, Integer emaManSeq, Integer calSeq) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.calSeq = calSeq;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "CAL_SEQ", nullable = false)
	public Integer getCalSeq() {
		return this.calSeq;
	}

	public void setCalSeq(Integer calSeq) {
		this.calSeq = calSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelExamesNotificacaoId)) {
			return false;
		}
		AelExamesNotificacaoId castOther = (AelExamesNotificacaoId) other;

		return ((this.getEmaExaSigla() == castOther.getEmaExaSigla()) || (this
				.getEmaExaSigla() != null
				&& castOther.getEmaExaSigla() != null && this.getEmaExaSigla()
				.equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq() == castOther.getEmaManSeq())
				&& (this.getCalSeq() == castOther.getCalSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		result = 37 * result + this.getCalSeq();
		return result;
	}

}
