package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AghEmailId generated by hbm2java
 */
@Embeddable
public class AghEmailId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -134027800760735348L;
	private String PTipoMens;
	private String PArqOuTexto;
	private String PAssunto;
	private String PEmails;
	private Date PData;
	private Integer version;

	public AghEmailId() {
	}

	public AghEmailId(Integer version) {
		this.version = version;
	}

	public AghEmailId(String PTipoMens, String PArqOuTexto, String PAssunto, String PEmails, Date PData, Integer version) {
		this.PTipoMens = PTipoMens;
		this.PArqOuTexto = PArqOuTexto;
		this.PAssunto = PAssunto;
		this.PEmails = PEmails;
		this.PData = PData;
		this.version = version;
	}

	@Column(name = "P_TIPO_MENS", length = 1)
	@Length(max = 1)
	public String getPTipoMens() {
		return this.PTipoMens;
	}

	public void setPTipoMens(String PTipoMens) {
		this.PTipoMens = PTipoMens;
	}

	@Column(name = "P_ARQ_OU_TEXTO", length = 4000)
	@Length(max = 4000)
	public String getPArqOuTexto() {
		return this.PArqOuTexto;
	}

	public void setPArqOuTexto(String PArqOuTexto) {
		this.PArqOuTexto = PArqOuTexto;
	}

	@Column(name = "P_ASSUNTO", length = 200)
	@Length(max = 200)
	public String getPAssunto() {
		return this.PAssunto;
	}

	public void setPAssunto(String PAssunto) {
		this.PAssunto = PAssunto;
	}

	@Column(name = "P_EMAILS", length = 1000)
	@Length(max = 1000)
	public String getPEmails() {
		return this.PEmails;
	}

	public void setPEmails(String PEmails) {
		this.PEmails = PEmails;
	}

	@Column(name = "P_DATA", length = 29)
	public Date getPData() {
		return this.PData;
	}

	public void setPData(Date PData) {
		this.PData = PData;
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
		umHashCodeBuilder.append(this.getPTipoMens());
		umHashCodeBuilder.append(this.getPArqOuTexto());
		umHashCodeBuilder.append(this.getPAssunto());
		umHashCodeBuilder.append(this.getPEmails());
		umHashCodeBuilder.append(this.getPData());
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
		if (!(obj instanceof AghEmailId)) {
			return false;
		}
		AghEmailId other = (AghEmailId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getPTipoMens(), other.getPTipoMens());
		umEqualsBuilder.append(this.getPArqOuTexto(), other.getPArqOuTexto());
		umEqualsBuilder.append(this.getPAssunto(), other.getPAssunto());
		umEqualsBuilder.append(this.getPEmails(), other.getPEmails());
		umEqualsBuilder.append(this.getPData(), other.getPData());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}