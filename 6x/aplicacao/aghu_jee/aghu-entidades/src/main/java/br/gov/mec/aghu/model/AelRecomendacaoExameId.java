package br.gov.mec.aghu.model;

// Generated 28/03/2011 10:51:33 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelRecomendacoesExameId generated by hbm2java
 */

@Embeddable
public class AelRecomendacaoExameId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4922036717268517542L;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Integer seqp;

	public AelRecomendacaoExameId() {
	}

	public AelRecomendacaoExameId(String emaExaSigla, Integer emaManSeq, Integer seqp) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.seqp = seqp;
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

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelRecomendacaoExameId)) {
			return false;
		}
		AelRecomendacaoExameId castOther = (AelRecomendacaoExameId) other;

		return ((this.getEmaExaSigla().equals(castOther.getEmaExaSigla())) || (this
				.getEmaExaSigla() != null
				&& castOther.getEmaExaSigla() != null && this.getEmaExaSigla()
				.equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq().equals(castOther.getEmaManSeq()))
				&& (this.getSeqp().equals(castOther.getSeqp()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}