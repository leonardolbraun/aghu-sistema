package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * EpeCuidadoUnfsId generated by hbm2java
 */
@Embeddable
public class EpeCuidadoUnfId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6203079873463956084L;
	private Short cuiSeq;
	private Short unfSeq;

	public EpeCuidadoUnfId() {
	}

	public EpeCuidadoUnfId(Short cuiSeq, Short unfSeq) {
		this.cuiSeq = cuiSeq;
		this.unfSeq = unfSeq;
	}

	@Column(name = "CUI_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getCuiSeq() {
		return this.cuiSeq;
	}

	public void setCuiSeq(Short cuiSeq) {
		this.cuiSeq = cuiSeq;
	}

	@Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuiSeq == null) ? 0 : cuiSeq.hashCode());
		result = prime * result + ((unfSeq == null) ? 0 : unfSeq.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		EpeCuidadoUnfId other = (EpeCuidadoUnfId) obj;
		if (cuiSeq == null) {
			if (other.cuiSeq != null) {
				return false;
			}
		} else if (!cuiSeq.equals(other.cuiSeq)) {
			return false;
		}
		if (unfSeq == null) {
			if (other.unfSeq != null) {
				return false;
			}
		} else if (!unfSeq.equals(other.unfSeq)) {
			return false;
		}
		return true;
	}

	
	
}
