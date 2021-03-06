package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmJustificativaTbId generated by hbm2java
 */
@Embeddable
public class MpmJustificativaTbId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7590925577047399635L;
	private Integer pmeAtdSeq;
	private Integer pmeSeq;
	private Short seqp;

	public MpmJustificativaTbId() {
	}

	public MpmJustificativaTbId(Integer pmeAtdSeq, Integer pmeSeq, Short seqp) {
		this.pmeAtdSeq = pmeAtdSeq;
		this.pmeSeq = pmeSeq;
		this.seqp = seqp;
	}

	@Column(name = "PME_ATD_SEQ", nullable = false)
	public Integer getPmeAtdSeq() {
		return this.pmeAtdSeq;
	}

	public void setPmeAtdSeq(Integer pmeAtdSeq) {
		this.pmeAtdSeq = pmeAtdSeq;
	}

	@Column(name = "PME_SEQ", nullable = false)
	public Integer getPmeSeq() {
		return this.pmeSeq;
	}

	public void setPmeSeq(Integer pmeSeq) {
		this.pmeSeq = pmeSeq;
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
		umHashCodeBuilder.append(this.getPmeAtdSeq());
		umHashCodeBuilder.append(this.getPmeSeq());
		umHashCodeBuilder.append(this.getSeqp());
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
		if (!(obj instanceof MpmJustificativaTbId)) {
			return false;
		}
		MpmJustificativaTbId other = (MpmJustificativaTbId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPmeAtdSeq(), other.getPmeAtdSeq());
		umEqualsBuilder.append(this.getPmeSeq(), other.getPmeSeq());
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####

}
