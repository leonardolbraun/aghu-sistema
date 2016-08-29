package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CseGrupoExpDetalheId generated by hbm2java
 */
@Embeddable
public class CseGrupoExpDetalheId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8279713644398813819L;
	private Short gueSeq;
	private Short dias;

	public CseGrupoExpDetalheId() {
	}

	public CseGrupoExpDetalheId(Short gueSeq, Short dias) {
		this.gueSeq = gueSeq;
		this.dias = dias;
	}

	@Column(name = "GUE_SEQ", nullable = false)
	public Short getGueSeq() {
		return this.gueSeq;
	}

	public void setGueSeq(Short gueSeq) {
		this.gueSeq = gueSeq;
	}

	@Column(name = "DIAS", nullable = false)
	public Short getDias() {
		return this.dias;
	}

	public void setDias(Short dias) {
		this.dias = dias;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getGueSeq());
		umHashCodeBuilder.append(this.getDias());
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
		if (!(obj instanceof CseGrupoExpDetalheId)) {
			return false;
		}
		CseGrupoExpDetalheId other = (CseGrupoExpDetalheId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getGueSeq(), other.getGueSeq());
		umEqualsBuilder.append(this.getDias(), other.getDias());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}