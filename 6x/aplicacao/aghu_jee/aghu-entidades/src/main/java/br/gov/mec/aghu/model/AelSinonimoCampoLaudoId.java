package br.gov.mec.aghu.model;

// Generated 25/01/2012 14:50:10 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelSinonimosCamposLaudoId generated by hbm2java
 */
@Embeddable
public class AelSinonimoCampoLaudoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1555161016286197180L;
	private Integer calSeq;
	private Short seqp;

	public AelSinonimoCampoLaudoId() {
	}

	public AelSinonimoCampoLaudoId(Integer calSeq, Short seqp) {
		this.calSeq = calSeq;
		this.seqp = seqp;
	}

	@Column(name = "CAL_SEQ", nullable = false)
	public Integer getCalSeq() {
		return this.calSeq;
	}

	public void setCalSeq(Integer calSeq) {
		this.calSeq = calSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calSeq == null) ? 0 : calSeq.hashCode());
		result = prime * result + ((seqp == null) ? 0 : seqp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		AelSinonimoCampoLaudoId other = (AelSinonimoCampoLaudoId) obj;
		if (calSeq == null) {
			if (other.calSeq != null){
				return false;
			}
		} else if (!calSeq.equals(other.calSeq)){
			return false;
		}
		if (seqp == null) {
			if (other.seqp != null){
				return false;
			}
		} else if (!seqp.equals(other.seqp)){
			return false;
		}
		return true;
	}

	

}
