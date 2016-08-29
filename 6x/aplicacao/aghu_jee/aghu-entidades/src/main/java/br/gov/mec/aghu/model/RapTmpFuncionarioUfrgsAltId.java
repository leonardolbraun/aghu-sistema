package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapTmpFuncionarioUfrgsAltId generated by hbm2java
 */
@Embeddable
public class RapTmpFuncionarioUfrgsAltId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7117572607765523684L;
	private String nome;
	private String faculdade;
	private Integer version;

	public RapTmpFuncionarioUfrgsAltId() {
	}

	public RapTmpFuncionarioUfrgsAltId(Integer version) {
		this.version = version;
	}

	public RapTmpFuncionarioUfrgsAltId(String nome, String faculdade, Integer version) {
		this.nome = nome;
		this.faculdade = faculdade;
		this.version = version;
	}

	@Column(name = "NOME", length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "FACULDADE", length = 50)
	@Length(max = 50)
	public String getFaculdade() {
		return this.faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getNome());
		umHashCodeBuilder.append(this.getFaculdade());
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
		if (!(obj instanceof RapTmpFuncionarioUfrgsAltId)) {
			return false;
		}
		RapTmpFuncionarioUfrgsAltId other = (RapTmpFuncionarioUfrgsAltId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getNome(), other.getNome());
		umEqualsBuilder.append(this.getFaculdade(), other.getFaculdade());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}