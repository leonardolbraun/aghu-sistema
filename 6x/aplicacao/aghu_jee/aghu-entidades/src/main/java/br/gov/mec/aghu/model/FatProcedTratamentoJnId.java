package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatProcedTratamentosJnId generated by hbm2java
 */
@Embeddable
public class FatProcedTratamentoJnId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964354974842977525L;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;
	private Integer tptSeq;
	private Integer phiSeq;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String indCancela;
	private String indTipoUso;

	public FatProcedTratamentoJnId() {
	}

	public FatProcedTratamentoJnId(String jnUser, Date jnDateTime,
			String jnOperation, Integer tptSeq, Integer phiSeq) {
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;
		this.tptSeq = tptSeq;
		this.phiSeq = phiSeq;
	}

	public FatProcedTratamentoJnId(String jnUser, Date jnDateTime,
			String jnOperation, Integer tptSeq, Integer phiSeq, Date criadoEm,
			Integer serMatricula, Short serVinCodigo, String indCancela,
			String indTipoUso) {
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;
		this.tptSeq = tptSeq;
		this.phiSeq = phiSeq;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indCancela = indCancela;
		this.indTipoUso = indTipoUso;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Column(name = "JN_DATE_TIME", nullable = false, length = 7)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}

	@Column(name = "TPT_SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getTptSeq() {
		return this.tptSeq;
	}

	public void setTptSeq(Integer tptSeq) {
		this.tptSeq = tptSeq;
	}

	@Column(name = "PHI_SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getPhiSeq() {
		return this.phiSeq;
	}

	public void setPhiSeq(Integer phiSeq) {
		this.phiSeq = phiSeq;
	}

	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "IND_CANCELA", length = 1)
	@Length(max = 1)
	public String getIndCancela() {
		return this.indCancela;
	}

	public void setIndCancela(String indCancela) {
		this.indCancela = indCancela;
	}

	@Column(name = "IND_TIPO_USO", length = 1)
	@Length(max = 1)
	public String getIndTipoUso() {
		return this.indTipoUso;
	}

	public void setIndTipoUso(String indTipoUso) {
		this.indTipoUso = indTipoUso;
	}
	

 	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getSerMatricula());
		umHashCodeBuilder.append(this.getSerVinCodigo());
		umHashCodeBuilder.append(this.getJnUser());
		umHashCodeBuilder.append(this.getJnDateTime());
		umHashCodeBuilder.append(this.getJnOperation());
		umHashCodeBuilder.append(this.getIndTipoUso());
		umHashCodeBuilder.append(this.getPhiSeq());
		umHashCodeBuilder.append(this.getTptSeq());
		umHashCodeBuilder.append(this.getIndCancela());
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
		if (!(obj instanceof FatProcedTratamentoJnId)) {
			return false;
		}
		FatProcedTratamentoJnId other = (FatProcedTratamentoJnId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getSerMatricula(), other.getSerMatricula());
		umEqualsBuilder.append(this.getSerVinCodigo(), other.getSerVinCodigo());
		umEqualsBuilder.append(this.getJnUser(), other.getJnUser());
		umEqualsBuilder.append(this.getJnDateTime(), other.getJnDateTime());
		umEqualsBuilder.append(this.getJnOperation(), other.getJnOperation());
		umEqualsBuilder.append(this.getIndTipoUso(), other.getIndTipoUso());
		umEqualsBuilder.append(this.getPhiSeq(), other.getPhiSeq());
		umEqualsBuilder.append(this.getTptSeq(), other.getTptSeq());
		umEqualsBuilder.append(this.getIndCancela(), other.getIndCancela());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}