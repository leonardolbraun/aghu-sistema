package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelPlacaSeqpRedomeId generated by hbm2java
 */
@Embeddable
public class AelPlacaSeqpRedomeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4627698702416797728L;
	private Long pc1Seq;
	private Short seqp;

	public AelPlacaSeqpRedomeId() {
	}

	public AelPlacaSeqpRedomeId(Long pc1Seq, Short seqp) {
		this.pc1Seq = pc1Seq;
		this.seqp = seqp;
	}

	@Column(name = "PC1_SEQ", nullable = false)
	public Long getPc1Seq() {
		return this.pc1Seq;
	}

	public void setPc1Seq(Long pc1Seq) {
		this.pc1Seq = pc1Seq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getPc1Seq());
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
		if (!(obj instanceof AelPlacaSeqpRedomeId)) {
			return false;
		}
		AelPlacaSeqpRedomeId other = (AelPlacaSeqpRedomeId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPc1Seq(), other.getPc1Seq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}