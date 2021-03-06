package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AnuHorarioHidratanteId generated by hbm2java
 */
@Embeddable
public class AnuHorarioHidratanteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8557860935076564189L;
	private Short hipHidSeq;
	private Integer hipDnuAtdSeq;
	private Integer hipDnuSeq;
	private Integer hipSeq;
	private Integer seq;

	public AnuHorarioHidratanteId() {
	}

	public AnuHorarioHidratanteId(Short hipHidSeq, Integer hipDnuAtdSeq, Integer hipDnuSeq, Integer hipSeq, Integer seq) {
		this.hipHidSeq = hipHidSeq;
		this.hipDnuAtdSeq = hipDnuAtdSeq;
		this.hipDnuSeq = hipDnuSeq;
		this.hipSeq = hipSeq;
		this.seq = seq;
	}

	@Column(name = "HIP_HID_SEQ", nullable = false)
	public Short getHipHidSeq() {
		return this.hipHidSeq;
	}

	public void setHipHidSeq(Short hipHidSeq) {
		this.hipHidSeq = hipHidSeq;
	}

	@Column(name = "HIP_DNU_ATD_SEQ", nullable = false)
	public Integer getHipDnuAtdSeq() {
		return this.hipDnuAtdSeq;
	}

	public void setHipDnuAtdSeq(Integer hipDnuAtdSeq) {
		this.hipDnuAtdSeq = hipDnuAtdSeq;
	}

	@Column(name = "HIP_DNU_SEQ", nullable = false)
	public Integer getHipDnuSeq() {
		return this.hipDnuSeq;
	}

	public void setHipDnuSeq(Integer hipDnuSeq) {
		this.hipDnuSeq = hipDnuSeq;
	}

	@Column(name = "HIP_SEQ", nullable = false)
	public Integer getHipSeq() {
		return this.hipSeq;
	}

	public void setHipSeq(Integer hipSeq) {
		this.hipSeq = hipSeq;
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getHipHidSeq());
		umHashCodeBuilder.append(this.getHipDnuAtdSeq());
		umHashCodeBuilder.append(this.getHipDnuSeq());
		umHashCodeBuilder.append(this.getHipSeq());
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
		if (!(obj instanceof AnuHorarioHidratanteId)) {
			return false;
		}
		AnuHorarioHidratanteId other = (AnuHorarioHidratanteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getHipHidSeq(), other.getHipHidSeq());
		umEqualsBuilder.append(this.getHipDnuAtdSeq(), other.getHipDnuAtdSeq());
		umEqualsBuilder.append(this.getHipDnuSeq(), other.getHipDnuSeq());
		umEqualsBuilder.append(this.getHipSeq(), other.getHipSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
