package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcTipoAnestesiaCombinadaId generated by hbm2java
 */
@Embeddable
public class MbcTipoAnestesiaCombinadaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3173749573475603657L;
	private Short tanSeq;
	private Short tanSeqCombina;

	public MbcTipoAnestesiaCombinadaId() {
	}

	public MbcTipoAnestesiaCombinadaId(Short tanSeq, Short tanSeqCombina) {
		this.tanSeq = tanSeq;
		this.tanSeqCombina = tanSeqCombina;
	}

	@Column(name = "TAN_SEQ", nullable = false)
	public Short getTanSeq() {
		return this.tanSeq;
	}

	public void setTanSeq(Short tanSeq) {
		this.tanSeq = tanSeq;
	}

	@Column(name = "TAN_SEQ_COMBINA", nullable = false)
	public Short getTanSeqCombina() {
		return this.tanSeqCombina;
	}

	public void setTanSeqCombina(Short tanSeqCombina) {
		this.tanSeqCombina = tanSeqCombina;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getTanSeq());
		umHashCodeBuilder.append(this.getTanSeqCombina());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MbcTipoAnestesiaCombinadaId)) {
			return false;
		}
		MbcTipoAnestesiaCombinadaId other = (MbcTipoAnestesiaCombinadaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getTanSeq(), other.getTanSeq());
		umEqualsBuilder.append(this.getTanSeqCombina(), other.getTanSeqCombina());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
