package br.gov.mec.aghu.model;

// Generated 05/05/2010 19:38:02 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AinDocsInternacaoId generated by hbm2java
 */
@Embeddable
public class AinDocsInternacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6757125159130428843L;
	private Integer intSeq;
	private Short ctdCspCnvCodigo;
	private Byte ctdCspSeq;
	private Byte ctdTpdSeq;

	public AinDocsInternacaoId() {
	}

	public AinDocsInternacaoId(Integer intSeq, Short ctdCspCnvCodigo,
			Byte ctdCspSeq, Byte ctdTpdSeq) {
		this.intSeq = intSeq;
		this.ctdCspCnvCodigo = ctdCspCnvCodigo;
		this.ctdCspSeq = ctdCspSeq;
		this.ctdTpdSeq = ctdTpdSeq;
	}

	@Column(name = "INT_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIntSeq() {
		return this.intSeq;
	}

	public void setIntSeq(Integer intSeq) {
		this.intSeq = intSeq;
	}

	@Column(name = "CTD_CSP_CNV_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getCtdCspCnvCodigo() {
		return this.ctdCspCnvCodigo;
	}

	public void setCtdCspCnvCodigo(Short ctdCspCnvCodigo) {
		this.ctdCspCnvCodigo = ctdCspCnvCodigo;
	}

	@Column(name = "CTD_CSP_SEQ", nullable = false, precision = 2, scale = 0)
	public Byte getCtdCspSeq() {
		return this.ctdCspSeq;
	}

	public void setCtdCspSeq(Byte ctdCspSeq) {
		this.ctdCspSeq = ctdCspSeq;
	}

	@Column(name = "CTD_TPD_SEQ", nullable = false, precision = 2, scale = 0)
	public Byte getCtdTpdSeq() {
		return this.ctdTpdSeq;
	}

	public void setCtdTpdSeq(Byte ctdTpdSeq) {
		this.ctdTpdSeq = ctdTpdSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AinDocsInternacaoId)) {
			return false;
		}
		AinDocsInternacaoId castOther = (AinDocsInternacaoId) other;

		return this.getIntSeq() != null && this.getIntSeq().equals(castOther.getIntSeq())
			&& this.getCtdCspCnvCodigo() != null && this.getCtdCspCnvCodigo().equals(castOther.getCtdCspCnvCodigo())
			&& this.getCtdCspSeq() != null && this.getCtdCspSeq().equals(castOther.getCtdCspSeq())
			&& this.getCtdTpdSeq() != null && this.getCtdTpdSeq().equals(castOther.getCtdTpdSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getIntSeq() == null ? 0 : this.getIntSeq().hashCode());
		result = 37 * result + (this.getCtdCspCnvCodigo() == null ? 0 : this.getCtdCspCnvCodigo().hashCode());
		result = 37 * result + (this.getCtdCspSeq() == null ? 0 : this.getCtdCspSeq().hashCode());
		result = 37 * result + (this.getCtdTpdSeq() == null ? 0 : this.getCtdTpdSeq().hashCode());
		return result;
	}

}
