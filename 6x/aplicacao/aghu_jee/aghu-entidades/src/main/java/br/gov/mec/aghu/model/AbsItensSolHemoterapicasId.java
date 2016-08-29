package br.gov.mec.aghu.model;

// Generated 21/09/2010 19:23:57 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsItensSolHemoterapicasId generated by hbm2java
 */

@Embeddable
public class AbsItensSolHemoterapicasId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 544404331987397954L;
	private Integer sheAtdSeq;
	private Integer sheSeq;
	private Short sequencia;

	public AbsItensSolHemoterapicasId() {
	}

	public AbsItensSolHemoterapicasId(Integer sheAtdSeq, Integer sheSeq, Short sequencia) {
		this.sheAtdSeq = sheAtdSeq;
		this.sheSeq = sheSeq;
		this.sequencia = sequencia;
	}

	@Column(name = "SHE_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getSheAtdSeq() {
		return this.sheAtdSeq;
	}

	public void setSheAtdSeq(Integer sheAtdSeq) {
		this.sheAtdSeq = sheAtdSeq;
	}

	@Column(name = "SHE_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSheSeq() {
		return this.sheSeq;
	}

	public void setSheSeq(Integer sheSeq) {
		this.sheSeq = sheSeq;
	}

	@Column(name = "SEQUENCIA", nullable = false, precision = 3, scale = 0)
	public Short getSequencia() {
		return this.sequencia;
	}

	public void setSequencia(Short sequencia) {
		this.sequencia = sequencia;
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
		AbsItensSolHemoterapicasId other = (AbsItensSolHemoterapicasId) obj;
		if (sequencia == null) {
			if (other.sequencia != null) {
				return false;
			}
		} else if (!sequencia.equals(other.sequencia)) {
			return false;
		}
		if (sheAtdSeq == null) {
			if (other.sheAtdSeq != null) {
				return false;
			}
		} else if (!sheAtdSeq.equals(other.sheAtdSeq)) {
			return false;
		}
		if (sheSeq == null) {
			if (other.sheSeq != null) {
				return false;
			}
		} else if (!sheSeq.equals(other.sheSeq)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((sequencia == null) ? 0 : sequencia.hashCode());
		result = prime * result
				+ ((sheAtdSeq == null) ? 0 : sheAtdSeq.hashCode());
		result = prime * result + ((sheSeq == null) ? 0 : sheSeq.hashCode());
		return result;
	}
}