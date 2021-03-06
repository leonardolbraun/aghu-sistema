package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AfaPrescricaoAssociadaId generated by hbm2java
 */
@Embeddable
public class AfaPrescricaoAssociadaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8856675850130930498L;
	private Short cmdSeq;
	private Short seqp;

	public AfaPrescricaoAssociadaId() {
	}

	public AfaPrescricaoAssociadaId(Short cmdSeq, Short seqp) {
		this.cmdSeq = cmdSeq;
		this.seqp = seqp;
	}

	@Column(name = "CMD_SEQ", nullable = false)
	public Short getCmdSeq() {
		return this.cmdSeq;
	}

	public void setCmdSeq(Short cmdSeq) {
		this.cmdSeq = cmdSeq;
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
		umHashCodeBuilder.append(this.getCmdSeq());
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
		if (!(obj instanceof AfaPrescricaoAssociadaId)) {
			return false;
		}
		AfaPrescricaoAssociadaId other = (AfaPrescricaoAssociadaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCmdSeq(), other.getCmdSeq());
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
