package br.gov.mec.aghu.model;

// Generated 11/03/2011 15:06:24 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AacGradeSituacoesId generated by hbm2java
 */

@Embeddable
public class AacGradeSituacaoId implements EntityCompositeId {

	private static final long serialVersionUID = 6097456287588797969L;
	private Integer grdSeq;
	private Date dtInicioSituacao;

	public AacGradeSituacaoId() {
	}

	public AacGradeSituacaoId(Integer grdSeq, Date dtInicioSituacao) {
		this.grdSeq = grdSeq;
		this.dtInicioSituacao = dtInicioSituacao;
	}

	@Column(name = "GRD_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getGrdSeq() {
		return this.grdSeq;
	}

	public void setGrdSeq(Integer grdSeq) {
		this.grdSeq = grdSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_SITUACAO", nullable = false, length = 7)
	public Date getDtInicioSituacao() {
		return this.dtInicioSituacao;
	}

	public void setDtInicioSituacao(Date dtInicioSituacao) {
		this.dtInicioSituacao = dtInicioSituacao;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AacGradeSituacaoId)) {
			return false;
		}
		AacGradeSituacaoId castOther = (AacGradeSituacaoId) other;

		return (this.getGrdSeq() == castOther.getGrdSeq())
				&& ((this.getDtInicioSituacao() == castOther
						.getDtInicioSituacao()) || (this.getDtInicioSituacao() != null
						&& castOther.getDtInicioSituacao() != null && this
						.getDtInicioSituacao().equals(
								castOther.getDtInicioSituacao())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGrdSeq();
		result = 37
				* result
				+ (getDtInicioSituacao() == null ? 0 : this
						.getDtInicioSituacao().hashCode());
		return result;
	}

}