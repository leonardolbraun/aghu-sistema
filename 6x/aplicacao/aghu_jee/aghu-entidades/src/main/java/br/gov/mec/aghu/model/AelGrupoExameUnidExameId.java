package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelGrupoExameUnidExameId generated by hbm2java
 */
@Embeddable
public class AelGrupoExameUnidExameId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8622428977833674243L;
	private Integer gexSeq;
	private String ufeEmaExaSigla;
	private Integer ufeEmaManSeq;
	private Short ufeUnfSeq;

	public AelGrupoExameUnidExameId() {
	}

	public AelGrupoExameUnidExameId(Integer gexSeq, String ufeEmaExaSigla, Integer ufeEmaManSeq, Short ufeUnfSeq) {
		this.gexSeq = gexSeq;
		this.ufeEmaExaSigla = ufeEmaExaSigla;
		this.ufeEmaManSeq = ufeEmaManSeq;
		this.ufeUnfSeq = ufeUnfSeq;
	}

	@Column(name = "GEX_SEQ", nullable = false)
	public Integer getGexSeq() {
		return this.gexSeq;
	}

	public void setGexSeq(Integer gexSeq) {
		this.gexSeq = gexSeq;
	}

	@Column(name = "UFE_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getUfeEmaExaSigla() {
		return this.ufeEmaExaSigla;
	}

	public void setUfeEmaExaSigla(String ufeEmaExaSigla) {
		this.ufeEmaExaSigla = ufeEmaExaSigla;
	}

	@Column(name = "UFE_EMA_MAN_SEQ", nullable = false)
	public Integer getUfeEmaManSeq() {
		return this.ufeEmaManSeq;
	}

	public void setUfeEmaManSeq(Integer ufeEmaManSeq) {
		this.ufeEmaManSeq = ufeEmaManSeq;
	}

	@Column(name = "UFE_UNF_SEQ", nullable = false)
	public Short getUfeUnfSeq() {
		return this.ufeUnfSeq;
	}

	public void setUfeUnfSeq(Short ufeUnfSeq) {
		this.ufeUnfSeq = ufeUnfSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUfeEmaExaSigla());
		umHashCodeBuilder.append(this.getUfeEmaManSeq());
		umHashCodeBuilder.append(this.getUfeUnfSeq());
		umHashCodeBuilder.append(this.getGexSeq());
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
		if (!(obj instanceof AelGrupoExameUnidExameId)) {
			return false;
		}
		AelGrupoExameUnidExameId other = (AelGrupoExameUnidExameId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUfeEmaExaSigla(), other.getUfeEmaExaSigla());
		umEqualsBuilder.append(this.getUfeEmaManSeq(), other.getUfeEmaManSeq());
		umEqualsBuilder.append(this.getUfeUnfSeq(), other.getUfeUnfSeq());
		umEqualsBuilder.append(this.getGexSeq(), other.getGexSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}